#include<stdio.h>
int main()
{
  int n,t,s;
  scanf("%d",&n);
  t=n%10;
  n=n/100;
  s=n+t;
  printf("%d",s);
  return 0;
}