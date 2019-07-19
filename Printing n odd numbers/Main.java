#include <stdio.h>
int main() {
  int n,i=1,j=1;
  scanf("%d",&n);
  for(;;)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
      i++;
      j++;
    }
    else
      i++;
    if(j==n+1)
      break;
  }
  return 0;
}