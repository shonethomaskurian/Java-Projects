#include<stdio.h>
int in(int ar, int arr[], int su[]);
int main()
{
    int ar;
	scanf("%d",&ar);
    int arr[ar];
    for(int index = 0;index < ar; index++)
    {
        scanf("%d", &arr[index]);   
    }
    int su[3 * ar];
    in(ar, arr, su);
    return 0;
}    
int in(int ar, int arr[], int su[])
{
	for(int index1 = 0; index1 <= ar - 1; index1++)
    {
        int key =  arr[index1];
        int flag = 1;
        for(int index2 = index1+1; index2<=ar-1;index2++)
        {
            if(arr[index2]>key)
            {
                for(int index3 = index1; index3 <= index2; index3++)
                {
                    if(arr[index3]>arr[index2])
                    flag = 0;
                }
                if(flag == 1)
                printf("%d,%d\n", key, arr[index2]);
            }
            flag = 1;
        }
    }
    return 0;
}