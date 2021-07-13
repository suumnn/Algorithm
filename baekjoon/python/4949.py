while True:
    data = input()
    stack = []
    flag = 0

    if data == '.':
        break

    for ch in data:
        if ch == '(' or ch == '[':
            stack.append(ch)
        elif ch == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            elif (not stack) or (stack[-1] == '['):
                flag = 1
                break
        elif ch == ']':
            if stack and stack[-1] == '[':
                stack.pop()
            elif (not stack) or (stack[-1] == '('):
                flag = 1
                break

    if flag == 0 and not stack:
        print('yes')
    else:
        print('no')
