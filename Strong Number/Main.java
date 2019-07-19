#include <stdio.h>

int fact(int a)
{
  int i=2,fact=1;
  for(;i<=a;i++)
  {
    fact*=i;
  }
  return fact;
}
    
int main() {
  int n,m,sum=0;
  scanf("%d",&n);
  m=n;
  while(m!=0)
  {
    sum+=fact(m%10);
    m/=10;
  }
  n==sum?printf("Yes"):printf("No");
  return 0;
}