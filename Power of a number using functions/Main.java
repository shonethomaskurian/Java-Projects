#include<stdio.h>
int c(int a,int b)
{
int power=1;
  while(b>=1)
  {
    power=power*a;
    b--;
  }
  printf("%d",power);
  return power;
}
int main ()
{
  int a,b;
  scanf("%d %d",&a,&b);
  c(a,b); 
  	return 0;
}