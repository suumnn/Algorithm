# 6063-6064 기초-3항연산

# 6063
a, b = map(int, input().split())
print(a if (a >= b) else b)

# 6064
a, b, c = map(int, input().split())
print((a if a < b else b) if ((a if a < b else b) < c) else c)
