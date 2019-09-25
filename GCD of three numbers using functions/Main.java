
#include <stdio.h>
int gcd (int n1,int n2,int n3)
{
  int a,gcd1;
  if((n1<n2)&&(n1<n3))
  {
    a=n1;
  }
  else if(n2<n3)
  {
    a=n2;
  }
  else
  {
    a=n3;
  }
  while(a>=1)
  {
    if((n1%a==0)&&(n2%a==0)&&(n3%a==0))
    {
      gcd1=a;
      break;
    }
    a--;
  }
  return gcd1;
}
int main()
{
int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  printf("%d",gcd(n1,n2,n3));
}