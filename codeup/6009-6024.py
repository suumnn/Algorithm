# 6009-6024 기초-입출력

# 6009
n = input()
print(n)

# 6010
n = input()
n = int(n)
print(n)

# 6011
n = input()
n = float(n)
print(n)

# 6012
a = input()
b = input()
print(a)
print(b)

# 6013
a = input()
b = input()
print(b)
print(a)

# 6014
n = input()
print(n)
print(n)
print(n)

# 6015
a, b = input().split()
print(a)
print(b)

# 6016
a, b = input().split()
print(b, a)

# 6017
a = input()
a = str(a)
print(a, a, a)

# 6018
a, b = input().split(':')
print(a, b, sep=':')
# print(a, b, sep=':')
# sep(separator)를 의미, ':' 기호를 사이에 두고 값을 출력

# 6019
y, m, d = input().split('.')
print(d, m, y, sep='-')

# 6020
a, b = input().split('-')
print(a, b, sep='')

# 6021
s = input()
print(s[0])
print(s[1])
print(s[2])
print(s[3])
print(s[4])

# 6022
s = input()
print(s[0:2], s[2:4], s[4:6])

# 6023
h, m, s = input().split(':')
print(m)

# 6024
w1, w2 = input().split()
s = w1 + w2
print(s)
