# 6077-6091 기초-종합

# 6077
n = int(input())
total = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        total += i

print(total)

# 6078
while 1:
    c = input()
    print(c)

    if c == 'q':
        break

# 6079
n = int(input())
total = 0

for i in range(1, n + 1):
    if n <= total:
        print(i - 1)
        break

    total += i

# 6080
n, m = map(int, input().split())

for i in range(1, n + 1):
    for j in range(1, m + 1):
        print(i, j)

# 6081
n = int(input(), 16)

for i in range(1, 16):
    print('%X' % n, '*%X' % i, '=%X' % (n*i), sep='')

# 6082
n = int(input())

for i in range(1, n + 1):
    if i % 10 == 3 or i % 10 == 6 or i % 10 == 9:
        print("X", end=' ')
    else:
        print(i, end=' ')

# 6083 문자열 포맷팅 생각할 것(속도)
r, g, b = map(int, input().split())

for i in range(r):
    for j in range(g):
        for k in range(b):
            print('{} {} {}'.format(i, j, k))

print(r * g * b)

# 6084
h, b, c, s = map(int, input().split())
print('%.1f MB' % (h * b * c * s / 8 / 1024 / 1024))

# 6085
w, h, b = map(int, input().split())
print('%.2f MB' % (w * h * b / 8 / 1024 / 1024))

# 6086
n = int(input())
total = 0

for i in range(1, n + 1):
    if n <= total:
        break

    total += i
    i += 1

print(total)

# 6087
n = int(input())
total = 0

if n == 1:
    print(1)
else:
    for i in range(1, n + 1):
        if n <= total:
            print(total)
            break

        total += i

# 6087
n = int(input())

for i in range(1, n + 1):
    if i % 3 == 0:
        continue
    print(i)

# 6088
a, d, n = map(int, input().split())
res = a

for i in range(n - 1):
    res += d

print(res)

# 6089
a, r, n = map(int, input().split())
res = a

for i in range(n - 1):
    res *= r

print(res)

# 6090
a, m, d, n = map(int, input().split())
res = a

for i in range(n - 1):
    res = res * m + d

print(res)

# 6091
a, b, c = map(int, input().split())
d = 1

while d % a != 0 or d % b != 0 or d % c != 0:
    d += 1

print(d)
