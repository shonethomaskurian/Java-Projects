#include <stdio.h>
int main() {
	int num,sum=0,r;
    scanf("%d",&num);
    while(num)
    {
        r=num%10;
        num=num/10;
        sum=sum+r;
    }
    printf("%d",sum);
	return 0;
}