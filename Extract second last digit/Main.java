#include<stdio.h>
int main()
{
int n,s;
  scanf("%d",&n);
  n=n%100;
  s=n/10;
  printf("%d",s);
  return 0;
}