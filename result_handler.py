import os
import json
import matplotlib.pyplot as plt
import numpy as np

def read_json_file(file_path):
    """读取JSON文件并返回内容。"""
    with open(file_path, 'r') as file:
        return json.load(file)
    
dir = ['codellama_test_result_after_repair', 'chatgpt_test_result_after_repair', 'gpt4_test_result_after_repair']
content_path = os.listdir('temp/' + dir[0])
content_path = sorted(content_path, key=lambda path: len(read_json_file(f"temp/{dir[0]}/{path}")), reverse=True)

def read(file):
    # 初始化一个字典来存储结果计数
    results_count = {
        "Accept": 0,
        "Syntax Error": 0,
        "Compile Error": 0,
        "Test Error": 0
    }
    # 遍历列表中的每个条目
    for entry in file:
        # 遍历每个关键的测试结果字段
        for key in ['SourceCode&Full', 'SourceCode&Simple', 'SourceCodeOnly']:
            # 累加每种结果的出现次数
            for result in entry[key]:
                if result in results_count:
                    results_count[result] += 1
    return results_count

Accept = [[] for i in range(3)]
Syntax_Error = [[] for i in range(3)]
Compile_Error = [[] for i in range(3)]
Test_Error = [[] for i in range(3)]

for i, path in enumerate(content_path):
    for j, d in enumerate(dir):
        file = read_json_file(f"temp/{d}/{path}")
        count = read(file)
        Accept[j].append(count['Accept'])
        Syntax_Error[j].append(count['Syntax Error'])
        Compile_Error[j].append(count['Compile Error'])
        Test_Error[j].append(count['Test Error'])

# Sort the lists based on the order of the Accept list
# Accept, Syntax_Error, Compile_Error, Test_Error = zip(*sorted(zip(Accept, Syntax_Error, Compile_Error, Test_Error), key=lambda x: x[0] + x[1] + x[2] + x[3]))


# print(Accept)
        


N = 9
Accept_list = np.array(Accept)
Syntax_Error_list = np.array(Syntax_Error)
Compile_Error_list = np.array(Compile_Error)
Test_Error_list = np.array(Test_Error)
ind = np.arange(N)    # 组的x坐标位置
width = 0.25       # 柱子的宽度
space = 0.05      # 小组之间的间隙

# 绘制图形
fig, ax = plt.subplots()
# 设置图形的长宽比
fig.set_size_inches(14, 6) 

# Set color palette for a single bar
# color_palette = ['LimeGreen', 'Gold', 'RoyalBlue', 'red']
# ax.set_prop_cycle('color', color_palette)

# 为每个子组创建一个柱子
for i in range(3):
    ax.bar(ind - (width+space) + i*(width+space), Accept_list[i], width, label='Accept', color='LimeGreen')
    ax.bar(ind - (width+space) + i*(width+space), Test_Error_list[i], width, bottom=Accept_list[i], label='Test Error', color='Gold')
    ax.bar(ind - (width+space) + i*(width+space), Compile_Error_list[i], width, bottom=Accept_list[i] + Test_Error_list[i], label='Compile Error', color='RoyalBlue')
    ax.bar(ind - (width+space) + i*(width+space), Syntax_Error_list[i], width, bottom=Accept_list[i] + Test_Error_list[i] + Compile_Error_list[i], label='Syntax Error', color='red')

# # 标注每个子组的标签
# for i, d in enumerate(dir):
#     x = ind - (width+space) + i*(width+space)
#     ax.text(x[0], -5, d.split('_')[0], ha='center', va='top')
    

# ax.axhline(0, color='grey', linewidth=0.8)
ax.set_ylabel('Counts')
ax.set_title('Counts by group and error type')
ax.set_xticks(ind, [i.split('_')[0] for i in content_path])
# ax.set_yticks(np.arange(0, 81, 10))
ax.legend(handles=ax.containers, labels=['Accept', 'Test Error', 'Compile Error', 'Syntax Error'])

# 添加说明信息
# plt.text(0.5, 0.5, 'Hello World!', ha='center', va='center', transform=ax.transAxes)

plt.savefig('counts.png', dpi=300, bbox_inches='tight')
# plt.show()
plt.close()

codellama_list = [sum(Accept[0]), sum(Syntax_Error[0]), sum(Compile_Error[0]), sum(Test_Error[0])]
chatgpt_list = [sum(Accept[1]), sum(Syntax_Error[1]), sum(Compile_Error[1]), sum(Test_Error[1])]
gpt4_list = [sum(Accept[2]), sum(Syntax_Error[2]), sum(Compile_Error[2]), sum(Test_Error[2])]

# Defining colors for the labels
colors = {'Accept': 'LimeGreen', 'Syntax Error': 'red', 'Compile Error': 'RoyalBlue', 'Test Error': 'Gold'}
labels = list(colors.keys())

# # Creating the figure and axes for the subplot (excluding the combined chart this time)
# fig, axs = plt.subplots(1, 3, figsize=(15, 5))  # Adjusted for 3 pie charts instead of 4

# # Adjusting pie charts to include specific colors based on the label
# for i, data in enumerate([codellama_list, chatgpt_list, gpt4_list]):
#     axs[i].pie(data, labels=labels, autopct='%1.1f%%', colors=[colors[label] for label in labels])
#     axs[i].set_title(['CodeLlama', 'ChatGPT', 'GPT-4'][i] + ' Data')

# plt.tight_layout()

# Adjusting the first chart to include a single legend for the whole subplot area
fig, axs = plt.subplots(1, 3, figsize=(15, 5))  # Setup for 3 pie charts

# Pie charts without labels inside
for i, data in enumerate([codellama_list, chatgpt_list, gpt4_list]):
    wedges, texts, autotexts = axs[i].pie(data, autopct='%1.1f%%', colors=[colors[label] for label in labels], labels=['']*4)
    axs[i].set_title(['CodeLlama', 'ChatGPT', 'GPT-4'][i] + ' Data')

# Creating a single legend for the first chart and positioning it outside
handles, labels_list = wedges, labels
fig.legend(handles, labels_list, title="Label", loc="center right", bbox_to_anchor=(1, 0.5))

plt.tight_layout(pad=3, rect=[0, 0, 0.9, 1])  # Adjust layout to make room for legend

# plt.legend()
plt.savefig('all_pie_charts.png')

# Saving the figures individually without the combined chart
for i, data in enumerate([codellama_list, chatgpt_list, gpt4_list], start=1):
    fig, ax = plt.subplots()
    ax.pie(data, labels=labels, autopct='%1.1f%%', colors=[colors[label] for label in labels])
    ax.set_title(['CodeLlama', 'ChatGPT', 'GPT-4'][i-1] + ' Data')
    plt.savefig(f'colored_pie_chart_{i}.png')