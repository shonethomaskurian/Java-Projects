#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int arr[20];
        int i, j;
        for(i=0; i<n; i++)
        {
            scanf("%d",&arr[i]);
        }
        printf("%d",sum( arr, n ) );
        return 0;
}
     int sum( int arr[], int n )
    {
        int ru, ma, i;
  
 	    ru = arr[0];
  	    ma = arr[0];
  	    for(i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                ru=ru+ arr[i];
            }
            else 
            {
                ru= arr[i];
            }
            if(ru > ma)
            {
                ma = ru;
            }
        }
        return ma;
    }