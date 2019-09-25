#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  while(n>0)
  {
    if((n/10)<=9)
    {
      printf("%d",n%10);
      break;
    }
    n=n/10;
  }
	return 0;
}