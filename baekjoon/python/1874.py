n = int(input())
stack = []
res = []
cnt = 1
flag = True

for _ in range(n):
    num = int(input())

    while cnt <= num:
        stack.append(cnt)
        res.append("+")
        cnt += 1

    if stack[-1] == num:
        stack.pop()
        res.append("-")
    else:
        flag = False
        break

if not flag:
    print("NO")
else:
    for i in res:
        print(i)
