# 6052-6058 기초-논리연산

# 6052
n = int(input())
print(bool(n))

# 6053
n = bool(int(input()))
print(not n)

# 6054
a, b = map(int, input().split())
print(bool(a) and bool(b))

# 6055
a, b = map(int, input().split())
print(bool(a) or bool(b))

# 6056
a, b = map(int, input().split())
a = bool(a)
b = bool(b)
print((a and (not b)) or ((not a) and b))

# 6057
a, b = map(int, input().split())
a = bool(a)
b = bool(b)
print((not a and not b) or (a and b))

# 6058
a, b = map(int, input().split())
a = bool(a)
b = bool(b)
print((not a) and (not b))
