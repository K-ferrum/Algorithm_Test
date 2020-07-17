/*
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 
그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 
일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, 
N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
*/

#include <iostream>
using namespace std;

int progress(int n)
{
	int count = 0;
	for (int i = 1; i <= n; i++)
	{
		if (i < 100)
		{
			count++;
		}
		else
		{
			int a[4] = { 0, };
			unsigned int b, c, d = 0;
			int x = i;
			for (int j = 3; j >= 0; j--)
			{
				if (x < 10)
				{
					a[j] = x;
					break;
				}
				a[j] = x % 10;
				x /= 10;
			}
			if (a[0] == 0)
			{
				b = a[2] - a[3];
				c = a[1] - a[2];
				if (c == b)
					count++;
			}
			else if (a[0] != 0)
			{
				b = a[2] - a[3];
				c = a[1] - a[2];
				d = a[0] - a[1];
				if (c == b && c == d)
					count++;
			}
			
		}
	}
	return count;
}
int main() 
{
	int n;
	int x = 0;
	cin >> n;
	x = progress(n);
	cout << x << endl;
	return 0;
}