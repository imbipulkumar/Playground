#include <stdio.h>
#include <math.h>
int main() {
  int n,m,count=0,arm=0;
  scanf("%d",&n);
  m=n;
  while(m!=0)
  {
    m/=10;
    count++;
  }
  m=n;
  while(m!=0)
  {
    arm+=pow(m%10,count);
    m/=10;
  }
  n==arm?printf("Armstrong Number"):printf("Not an Armstrong Number");
  return 0;
}