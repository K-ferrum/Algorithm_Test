# 최댓값

a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
f = int(input())
g = int(input())
h = int(input())
i = int(input())
j = [a, b, c, d, e, f, g, h, i]
k = max(j)
for i in range(9):
    if j[i] == k:
        print(k)
        print(i+1)