#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[10],c[10],str[10][10];
  int i=0,j=0,k=0,w,p;
      gets(a);
      scanf("%s",b);
      scanf("%s",c);
      p=strlen(a);
      for (k=0; k<p; k++)
      {
        if (a[k]!=' ')
        {
          str[i][j] = a[k];
          j++;
        }
        else
        {
          str[i][j]='\0';
          j=0; i++;
        }
      }
  str[i][j]='\0';
  w=i;
  for (i=0; i<=w; i++)
  {
    if(strcmp(str[i],b)==0)
      strcpy(str[i],c);
    printf("%s ",str[i]);
  }
  return 0;
}