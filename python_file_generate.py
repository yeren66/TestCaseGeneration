from human_eval.data import read_problems

problems = read_problems()

for problem_id, problem in problems.items():
    id = problem_id.split("/")[-1]
    print(id)
    # 创建源代码文件

    # with open(f"dataset/source_code_{id}.py", "w") as f:
    #     f.write(problem['prompt'] + problem['canonical_solution'])

    # 创建测试代码文件
    # with open(f"dataset/test_code_{id}.py", "w") as f:
    #     f.write("from source_code_" + id + f" import {problem['entry_point']}\n")
    #     f.write(problem['test'])
    #     f.write(f"check({problem['entry_point']})")

    # 创建生成代码文件
    with open(f"dataset/generate_test_code_{id}.py", "w") as f:
        f.write("from source_code_" + id + f" import {problem['entry_point']}\n\n")
        with open(f"generate_data/gtest_code_{id}.py", "r") as g:
            f.write(g.read())
        f.write(f"\n\ncheck({problem['entry_point']})")
