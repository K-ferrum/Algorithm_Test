# 평균 점수

import sys
x = 0
for i in range(5):
    a = int(sys.stdin.readline())
    if a < 40:
        a = 40
    x += a
print(int(x / 5))