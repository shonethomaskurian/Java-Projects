#include <stdio.h>
int main()
{
	int n,i,j;
  scanf("%d",&n);
  int count=0;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(count==0)
      {
        printf("*");
        count=1;
      }
      else
      {
        printf("#");
        count=0;
      }
     
    }
     printf("\n");
  }
  	return 0;
}