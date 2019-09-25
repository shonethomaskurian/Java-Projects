#include <stdio.h>
int main() {
	int num, last,s ;
    scanf("%d", &num);
    last = num%10;
    while(num>=10)
    {
        num = num/10;
    }
 s=last+num;
  printf("%d",s);
	return 0;
}