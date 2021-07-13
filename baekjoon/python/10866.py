import sys
from collections import deque

n = int(sys.stdin.readline().rstrip())
dq = deque()

for _ in range(n):
    data = sys.stdin.readline().rstrip().split()
    order = data[0]

    if order == 'push_front':
        dq.appendleft(data[1])
    elif order == 'push_back':
        dq.append(data[1])
    elif order == 'pop_front':
        if dq:
            print(dq.popleft())
        else:
            print(-1)
    elif order == 'pop_back':
        if dq:
            print(dq.pop())
        else:
            print(-1)
    elif order == 'size':
        print(len(dq))
    elif order == 'empty':
        if not dq:
            print(1)
        else:
            print(0)
    elif order == 'front':
        if dq:
            print(dq[0])
        else:
            print(-1)
    elif order == 'back':
        if dq:
            print(dq[-1])
        else:
            print(-1)

