# 6065-6070 기초-조건/선택실행구조

# 6065
a, b, c = map(int, input().split())
if a % 2 == 0:
    print(a)
if b % 2 == 0:
    print(b)
if c % 2 == 0:
    print(c)

# 6066
a, b, c = map(int, input().split())
if a % 2 == 0:
    print("even")
else:
    print("odd")
if b % 2 == 0:
    print("even")
else:
    print("odd")
if c % 2 == 0:
    print("even")
else:
    print("odd")

# 6067
n = int(input())

if n < 0: # 음수
    if n % 2 == 0:
        print('A')
    else:
        print('B')
else: # 양수
    if n % 2 == 0:
        print('C')
    else:
        print('D')

# 6068
n = int(input())

if n >= 90:
    print('A')
elif n >= 70:
    print('B')
elif n >= 40:
    print('C')
else:
    print('D')

# 6069
c = input()

if c == 'A':
    print("best!!!")
elif c == 'B':
    print("good!!")
elif c == 'C':
    print("run!")
elif c == 'D':
    print("slowly~")
else:
    print("what?")

# 6070
n = int(input())

if n // 3 == 1:
    print("spring")
elif n // 3 == 2:
    print("summer")
elif n // 3 == 3:
    print("fall")
else:
    print("winter")
