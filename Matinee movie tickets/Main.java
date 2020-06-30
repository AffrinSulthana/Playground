#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  float x=10.15,y=13.30,z=18.00,m=22.00;
  cin>>a>>b;
  if(a>13)
  {
    if(b==y)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  else if(a<13)
  {
    if(b==y)
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
}