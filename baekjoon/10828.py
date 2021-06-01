import sys

n = int(sys.stdin.readline().rstrip())
stack = []

for _ in range(n):
    data = sys.stdin.readline().rstrip().split()
    order = data[0]

    if order == "push":
        stack.append(data[1])
    elif order == "pop":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif order == "size":
        print(len(stack))
    elif order == "empty":
        print(0) if stack else print(1)
    elif order == "top":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])
