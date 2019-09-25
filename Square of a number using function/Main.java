#include<stdio.h>
int square(int n)
{
  int sqr=n*n;
  return sqr;
}
int main() 
{
  int n;
  scanf("%d",&n);
  int sqr1= square(n);
  printf("%d",sqr1);
   return 0;
}