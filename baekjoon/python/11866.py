from collections import deque

n, k = map(int, input().split())
dq = deque([i for i in range(1, n + 1)])
res = []

while dq:
    dq.rotate(-(k - 1))
    res.append(dq.popleft())

print(str(res).replace("[", "<").replace("]", ">"))
