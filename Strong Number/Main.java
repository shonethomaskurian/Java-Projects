#include <stdio.h>
int main() {
	 int n,i,f,s,su=0;
  scanf("%d",&n);
  int x=n;
 while(n>0)
 {
   s=n%10;
   f=1;
   for(i=1;i<=s;i++)
   {
     f=f*i;
   }
  su=su+f;
  n=n/10;
 }
  if(su==x)
  {
      printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}
