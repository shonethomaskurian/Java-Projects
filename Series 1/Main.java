#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2!=0)
  {
    int a=1;
    int b=2;
    int d=(n+1)/2;
    int c=pow(2,d-1);
    printf("%d",c);
  }
  else
  {
    int a=1;
    int b=3;
    int d=n/2;
    int c=pow(3,d-1);
    printf("%d",c);
  }
  return 0;
}