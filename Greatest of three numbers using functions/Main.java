
#include <stdio.h>
int great(int n1,int n2,int n3)
  {
  if((n1>n2) && (n1>n3))
  {
    printf("%d",n1);
  }
  else if(n2>n3)
  {
    printf("%d",n2);
  }
  else
  {
    printf("%d",n3);
  }
  //return n1,n2,n3;
}
int main()
{
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  great(n1,n2,n3);
  return 0;
}