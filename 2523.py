# 별 찍기 - 13

a = int(input())
x = ''
for i in range(a):
    x += '*' * (i + 1)
    x += '\n'
for i in range(a - 1, 0, -1):
    x += '*' * (i)
    x += '\n'

print(x)