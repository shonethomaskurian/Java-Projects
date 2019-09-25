
#include <stdio.h>
#include<string.h>
int main()
{
  char a[100],s;
  gets(a);
  int len=strlen(a);
  int stat[26],idx,offset,n;
  for(int idx=0;idx<=25;idx++)
  {
    stat[idx]=0;
  }
  for(int idx=0;idx<=len;idx++)
  {
    if(a[idx]>='a'&&a[idx]<='z')
    {
      int offset=a[idx]-'a';
      stat[offset]++;
    }
  }
  for(idx=0;idx<=25;idx++)
  {
      if(stat[idx]==0)
      {
          //n=stat[idx];
           s=idx+'a';
            printf("%c ",s);
      }
     
  }
 // printf("%c%d ",s,n);
  
   return 0;
}