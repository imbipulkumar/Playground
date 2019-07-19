#include <stdio.h>
int main() {
  int n,i=1;
  scanf("%d",&n);
  for(;i<=n;i++)
  {
    if(i%2==1)
      printf("%d\n",i);
  }
  return 0;
}