#include<iostream>
using namespace std;
int main()
{
  int n,i;
  i=0;
  cin>>n;
  do{
    n=n/10;
    i++;
  }while(n>0);
  cout<<i;
}