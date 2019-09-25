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
            for(int index2 = index1+1; index2 <= ar-1; index2++)
            {       
                    if(arr[index2]>key)
                    printf("%d,%d\n", key,arr[index2]);
            }
        }
    return 0;
}