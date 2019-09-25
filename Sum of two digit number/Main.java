#include<stdio.h>
int main()
{
  int a,s,l,b;
  scanf("%d",&a);
  b=a%10;
  s=a/10;
  l=s+b;
  printf("%d",l);
  return 0;
}