#include <stdio.h>
int add(int n);
int main()
{
    int num;
    scanf("%d", &num);
    printf("%d",add(num));
    return 0;
}
int add(int n)
{
    if(n != 0)
        return n + add(n-1);
    else
        return n;
}