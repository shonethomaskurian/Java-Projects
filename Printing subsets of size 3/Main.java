#include<stdio.h>
int main()
{
  int i;
  {
    scanf("%d",&i);
    int arr[i];
    for(int index=0;index<=i-1;index++)
    {
      scanf("%d",&arr[index]);
    }
    for(int index1=0;index1<(i-1);index1++)
    {
      
      for(int index2=index1+1;index2<=(i-1);index2++)
      {
          for(int index3=index2+1;index3<=(i-1);index3++)
        {
            printf("(%d, %d, %d) ",arr[index1],arr[index2],arr[index3]);
        }
      }
      printf("\n");
    }
  }
      
  return 0;
}
 