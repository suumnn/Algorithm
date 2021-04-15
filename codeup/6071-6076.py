# 6071-6076 기초-반복실행구조

# 6071
n = 1
while n != 0:
    n = int(input())
    if n != 0:
        print(n)

# 6072
n = int(input())
while n != 0:
    print(n)
    n -= 1

# 6073
n = int(input())
while n != 0:
    n -= 1
    print(n)

# 6074
c = ord(input())
t = ord('a')
while t <= c:
    print(chr(t), sep='')
    t += 1

# 6075
n = int(input())
i = 0
while i <= n:
    print(i)
    i += 1

# 6076
n = int(input())
for i in range(n + 1):
    print(i)
