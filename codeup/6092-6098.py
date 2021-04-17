# 6092-6098 기초-리스트

# 6092
n = int(input())
arr = list(map(int, input().split()))
d = [0 for i in range(24)]

for i in range(n):
    d[arr[i]] += 1

for i in range(1, 24):
    print(d[i], sep='')

# 6093
n = int(input())
arr = list(map(int, input().split()))

arr.reverse()
for i in range(len(arr)):
    print(arr[i], end=' ')
# for i in range(n-1, -1, -1) :

# 6094
n = int(input())
arr = list(map(int, input().split()))

arr.sort()
print(arr[0])
# print(min(arr))

# 6095
n = int(input())
arr = [[0] * 19 for _ in range(19)]

for _ in range(n):
    a, b = map(int, input().split())
    arr[a-1][b-1] = 1

for i in arr:
    for j in i:
        print(j, end=' ')
    print()

# 6096
arr = [list(map(int, input().split())) for _ in range(19)]
n = int(input()) # 십자 뒤집기 횟수

for i in range(n):
    a, b = map(int, input().split()) # 십자 뒤집기 할 좌표

    for j in range(19):
        arr[a-1][j] = 1 if arr[a-1][j] == 0 else 0
        arr[j][b-1] = 1 if arr[j][b-1] == 0 else 0

for i in arr:
    for j in i:
        print(j, end=' ')
    print()

# 6097
h, w = map(int, input().split()) # 격자판의 세로, 가로
n = int(input()) # 막대의 개수
arr = [[0] * w for _ in range(h)]

# l, d, x, y 막대의 길이, 방향, 좌표
for i in range(n):
    l, d, x, y = map(int, input().split())
    # d == 0 가로, d == 1 세로
    if d == 0:
        for j in range(l):
            arr[x-1][y-1+j] = 1
    else:
        for j in range(l):
            arr[x-1+j][y-1] = 1

for i in arr:
    for j in i:
        print(j, end=' ')
    print()

# 6098
arr = [list(map(int, input().split())) for i in range(10)]
x, y = 1, 1
arr[x][y] = 9

while 1:
    if arr[x][y+1] == 0:
        y += 1
        arr[x][y] = 9
    elif arr[x][y+1] == 1: # 오른쪽 벽
        if arr[x+1][y] == 1:
            break
        elif arr[x+1][y] == 2:
            x += 1
            arr[x][y] = 9
            break
        else:
            x += 1
            arr[x][y] = 9
    else:
        y += 1
        arr[x][y] = 9
        break

for i in arr:
    for j in i:
        print(j, end=' ')
    print()
