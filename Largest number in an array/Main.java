#include<stdio.h>
int main()
{
   int i;
        scanf("%d",&i);
        int arr[10];
        for(int idx = 0; idx <= i - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        int j;
        if(arr[0] > arr[1])
        {
            j = arr[0];
        }
        else{
             j= arr[1];
        }  
        for(int idx = 2; idx <= i - 1; idx++)
        {
            if(j < arr[idx])
            {
                j = arr[idx];
            }
        }
        printf("%d",j);
    return 0;
}
  