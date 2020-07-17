# X보다 작은 수
#a = 10
#b = 5
#c = [1, 10, 4, 9, 2, 3, 8, 5, 7, 6]
import sys

a,b = map(int, sys.stdin.readline().split(" "))
c = list(map(int, sys.stdin.readline().split(" ")))

for i in c:
    if i < b:
        print(i, end=" ")
        continue