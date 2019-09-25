#include<stdio.h>
#include<string.h>
int main(){
    char str[100], tmp[26];
    scanf("%[^\n]s", str);
    int in = 0;
    for(int i = 0; str[i] != '\0'; i++)
    {
        if((str[i] == 't' || 'T') && str[i + 1] == 'h' && str[i + 2] == 'e')
        {
            i = i + 3;
        }
        else
        {
            tmp[in] = str[i];
            in++;
        }
    }
    tmp[in] = '\0';
    printf("%s\n", tmp);
    return 0;
}