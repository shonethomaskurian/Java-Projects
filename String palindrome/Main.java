#include <stdio.h>
 
int main()
{
  char c[100];
  int b, m, e, l = 0;
 
  gets(c);
 
  while (c[l] != '\0')
    l++;
 
  e = l - 1;
  m = l/2;
 
  for (b = 0; b < m; b++)
  {
    if (c[b] != c[e])
    {
      printf("%s is not a palindrome",c);
      break;
    }
    e--;
  }
  if (b == m)
    printf("%s is a palindrome",c);
 
  return 0;
}