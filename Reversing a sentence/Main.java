#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  int i;
  gets(a);
  int n=strlen(a);
  for(i=n-1;i>=0;i--)
  {
    if(a[i]==' ')
    {
      printf("%s ",&a[i+1]);
    a[i]='\0';
    }
  }
  printf("%s",&a[i+1]);
  
   
  
    
  return 0;
}