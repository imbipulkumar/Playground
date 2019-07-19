#include <stdio.h>
#include <math.h>
int main() {
  int n,m,count=0,f,l;
  scanf("%d",&n);
  m=n;
  while(m!=0)
  {
    m/=10;
    count++;
  }
  f=n/pow(10,count-1);
  l=n%10;
  printf("%d",f+l);
}