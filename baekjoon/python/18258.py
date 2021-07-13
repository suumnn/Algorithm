import sys
from collections import deque

n = int(sys.stdin.readline().strip())
dq = deque()

for _ in range(n):
    data = sys.stdin.readline().strip().split()
    order = data[0]

    if order == "push":
        dq.append(data[1])
    elif order == "pop":
        if not dq:
            print("-1")
        else:
            print(dq.popleft())
    elif order == "size":
        print(len(dq))
    elif order == "empty":
        if not dq:
            print("1")
        else:
            print("0")
    elif order == "front":
        if not dq:
            print("-1")
        else:
            print(dq[0])
    elif order == "back":
        if not dq:
            print("-1")
        else:
            print(dq[-1])
