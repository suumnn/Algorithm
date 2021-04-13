# 6032-6045 기초-산술연산 (6042 기초-값변환)

# 6032
n = int(input())
print(-n)
# print(-int(input()))

# 6033
n = ord(input())
print(chr(n+1))

# 6034
a, b = map(int, input().split())
print(a - b)

# 6035
a, b = map(float, input().split())
print(a * b)

# 6036
word, n = input().split()
print(word * int(n))

# 6037
n = input()
string = input()
print(string * int(n))

# 6038
a, b = map(int, input().split())
print(a ** b)

# 6039
a, b = map(float, input().split())
print(a ** b)

# 6040
a, b = map(int, input().split())
print(a // b)


# 6041
a, b = map(int, input().split())
print(a % b)

# 6042
a = float(input())
print(format(a, ".2f"))

# 6043
a, b = map(float, input().split())
print(format(a / b, ".3f"))

# 6044
a, b = map(int, input().split())
print(a + b)
print(a - b)
print(a * b)
print(a // b)
print(a % b)
print(format(round(a / b, 2)))
# 정확도 출력이므로 출력 서식지정자가 아닌 round 사용

# 6045
a, b, c = map(int, input().split())
total = a + b + c
avg = total / 3
print(total, format(avg, ".2f"))
