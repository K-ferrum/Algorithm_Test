# 별 찍기 - 21

a = int(input())
y = a//2
x = a - a//2

for i in range(a):
    print("* " * x)
    print(" *" * y)