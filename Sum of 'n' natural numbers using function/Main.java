#include<stdio.h>
int sum(int n)
{
  int sum;
  sum=(n*(n+1))/2;
  return sum;
}
int main() 
{
  int n;
  scanf("%d",&n);
  int sum1=sum(n);
  printf("%d",sum1); 
  	return 0;
}