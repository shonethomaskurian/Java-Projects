// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int k=0;k<=n-1;k++)
  {
    scanf("%d",&arr[k]);
  } 
  int max=arr[0],id;
  for(int i=0;i<n;i++)
  {
    if(arr[i]>max)
      id=i;
  }
  printf("%d",id);
   return 0;
}