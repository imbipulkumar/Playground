#include <stdio.h>
int main() {
  int n,m,count=0,chk=1;
  scanf("%d",&n);
  m=n;
  while(m!=0)
  {
    m=m/10;
    count++;
  }
  while(chk!=count-1)
  {
    n=n/10;
    chk++;
  }
  printf("%d",n%10);
  return 0;
}