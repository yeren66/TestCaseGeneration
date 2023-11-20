import requests
import json
from json_reader import json_data
from prompt import instruct_prompt, instruct_prompt_ooold

url = 'http://localhost:11434/api/generate'
data = {
    "model": "codellama",
    "prompt": instruct_prompt_ooold(json_data[1]['solution_code'])
}
headers = {'Content-Type': 'application/json'}

response = requests.post(url, data=json.dumps(data), headers=headers)

# 用于处理JSON流的函数
def process_json_stream(json_stream):
    concatenated_responses = ""
    for line in json_stream.split('\n'):
        if line.strip():  # 确保行不为空
            try:
                data = json.loads(line)
                if 'response' in data:
                    concatenated_responses += data['response']
            except json.JSONDecodeError as e:
                print(f"Ignoring invalid JSON: {e}")

    # result = {"concatenated_responses": concatenated_responses}
    # return json.dumps(result, ensure_ascii=False)
    return concatenated_responses


# print(response.text)
print(json_data[0]['methods_info'][0]['solution_code'])
print()
print("--------------------------------------------------")

@staticmethod
def _parse_ret(ret: Dict) -> List:
    rets = []
    output = ret["choices"][0]["message"]["content"]
    if "```" in output:
        for x in output.split("```")[1].splitlines():
            if x.strip() == "":
                continue
            try:
                # remove comments
                input = ast.literal_eval(f"[{x.split('#')[0].strip()}]")
            except:  # something wrong.
                continue
            rets.append(input)
    # else:
    #     rets = output
    return rets

output = process_json_stream(response.text)
print(output)
with open('generate_test_code_1.py', 'w') as f:
    f.write(output)
# print(output['concatenated_responses'])
