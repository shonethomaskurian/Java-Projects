/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
   int n,i,s=0,d=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<=(n/2)-1;i++)
  {
    s=s+arr[i];
  }
  for(i=(n/2);i<n;i++)
  {
     d=d+arr[i];
  }
  
    if(s==d)
    {
      printf("Perfect Batch");
    }
    else
    {
      printf("Not a Perfect Batch");
    }
  
    
  return 0;
}