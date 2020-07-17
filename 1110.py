# 더하기 사이클

import sys

a = int(sys.stdin.readline())
x = a
i = 0
while 1:
    y=x//10+x%10
    x=x%10*10+y%10
    i+=1
    if(a==x):break
print(i)