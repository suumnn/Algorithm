from collections import deque

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    dq = deque(map(int, input().split())) # 중요도
    check = deque([0 for _ in range(len(dq))]) # 궁금한 문서 표시
    check[m] = 1

    count = 0 # 몇 번째로 인쇄되는지
    while True:
        if dq[0] == max(dq):
            count += 1

            if check[0] == 1:
                print(count)
                break
            else:
                dq.popleft()
                check.popleft()
        else:
            dq.append(dq.popleft())
            check.append(check.popleft())
