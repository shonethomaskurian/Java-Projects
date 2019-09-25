#include <stdio.h>
int main() {
int a,r,re,c;
  scanf("%d",&a);
  c=a;
  while(c!=0)
  {
    re=c%10;
    r+=re*re*re;
    c=c/10;
  }
  if(r==a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    
  return 0;
}