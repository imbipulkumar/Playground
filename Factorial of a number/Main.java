#include <stdio.h>
int main() {
  int n,i,fact=1;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
    fact*=i;
  }
  printf("%d",fact);
  return 0;
}