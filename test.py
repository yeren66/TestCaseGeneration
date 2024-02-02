import matplotlib.pyplot as plt
import numpy as np

# # 数据
# N = 5
# menMeans = (20, 35, 30, 35, 27)
# womenMeans = (25, 32, 34, 20, 25)
# menStd = (2, 3, 4, 1, 2)
# womenStd = (3, 5, 2, 3, 3)
# ind = np.arange(N)    # 组的x坐标位置
# width = 0.35       # 柱子的宽度

# # 绘制图形
# fig = plt.figure()
# ax = fig.add_subplot(111)

# p1 = ax.bar(ind, menMeans, width, color='r', bottom=womenMeans)
# p2 = ax.bar(ind, womenMeans, width, color='b')

# ax.axhline(0, color='grey', linewidth=0.8)
# ax.set_ylabel('Scores')
# ax.set_title('Scores by group and gender')
# ax.set_xticks(ind, ('G1', 'G2', 'G3', 'G4', 'G5'))
# ax.set_yticks(np.arange(0, 81, 10))
# ax.legend((p1[0], p2[0]), ('men', 'women'))

# plt.show()

# 数据
N = 5
menMeans = np.array([[20, 35, 30, 35, 27], [25, 32, 34, 20, 25]])
womenMeans = np.array([[25, 32, 34, 20, 25], [30, 35, 30, 35, 27]])
ind = np.arange(N)    # 组的x坐标位置
width = 0.25       # 柱子的宽度
space = 0.05      # 小组之间的间隙

# 绘制图形
fig, ax = plt.subplots()

# 为每个子组创建一个柱子
for i in range(2):
    ax.bar(ind - width/2 + i*(width+space), menMeans[i], width, label='Men Group'+str(i+1))
    ax.bar(ind - width/2 + i*(width+space), womenMeans[i], width, bottom=menMeans[i], label='Women Group'+str(i+1))

ax.axhline(0, color='grey', linewidth=0.8)
ax.set_ylabel('Scores')
ax.set_title('Scores by group and gender')
ax.set_xticks(ind, ('G1', 'G2', 'G3', 'G4', 'G5'))
ax.set_yticks(np.arange(0, 81, 10))
ax.legend()

plt.show()