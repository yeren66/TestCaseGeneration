
# 打开 log_file.log 文件
with open('log_file.log', 'r') as file:
    # 初始化计数器
    count = 0
    
    # 逐行读取文件内容
    for line in file:
        # 检查是否包含 "- ERROR - Syntax Error"
        if "- ERROR - Syntax Error" in line:
            # 计数器加一
            count += 1
    
    # 输出计数器的值
    print("共出现", count, "次“ - ERROR - Syntax Error”")
