#include <stdio.h>
 
int main()
{
   int m, n, c, d, f[10][10], s[10][10], di[10][10];

   scanf("%d%d", &m, &n);

   for (c = 0; c < m; c++)
     for (d = 0 ; d < n; d++)
       scanf("%d", &f[c][d]);
 
 
   for (c = 0; c < m; c++)
     for (d = 0; d < n; d++)
         scanf("%d", &s[c][d]);
 
 
   for (c = 0; c < m; c++) {
     for (d = 0; d < n; d++) {
       di[c][d] = f[c][d] - s[c][d];
       printf("%d ",di[c][d]);
     }
     printf("\n");
   }
 
   return 0;
}