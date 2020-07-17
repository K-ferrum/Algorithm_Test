# 별 찍기 - 9


a = 5
b = (a * 2) - 1
y = ' '
x = '*' * b
for i in range(1, a):
    x += '\n'
    x += y * i
    x += '*' * (b - 2)
    b -= 2
for i in range(a - 2, -1, -1):
    x += '\n'
    x += y * i
    x += '*' * (b + 2)
    b += 2
print(x)