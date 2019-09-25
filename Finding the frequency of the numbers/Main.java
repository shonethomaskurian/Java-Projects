#include <stdio.h>

void main()
{
    int arr1[100], fr1[100];
    int n,k, i, j, ctr;
	
	
      // printf("\n\nCount frequency of each element of an array:\n");
       //printf("------------------------------------------------\n");	

       //printf("Input the number of elements to be stored in the array :");
       scanf("%d",&n);
   scanf("%d",&k);
       //printf("Input %d elements in the array :\n",n);
       for(i=0;i<n;i++)
            {
	     // printf( %d : ",i);
	      scanf("%d",&arr1[i]);
		  //fr1[i] = -1;
	    }
    for(i=1; i<=k; i++)
    {
        //ctr = 1;
      int count=0;
      int w=0;
        for(j=0; j<n; j++)
        {
            w=arr1[j];
                if(i==w)
                {
                  count++;
            }
        }

         printf("%d %d\n", i, count);
        }
   // return 0;
}