t = int(input())

for _ in range(t):
    data = input()
    stack = []
    flag = 0

    for ch in data:
        if ch == '(':
            stack.append(ch)
        else: # ch == ')'
            if not stack:
                print('NO')
                flag = 1
                break
            else:
                stack.pop()

    if flag == 0:
        if not stack:
            print('YES')
        else:
            print('NO')

