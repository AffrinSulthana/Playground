#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int fp=fa*(100-fd)/100+fs;
  int sp=sa*(100-sd)/100+ss;
  int ap=aa*(100-ad)/100+as;
  cout<<"In Flipkart Rs."<<fp<<"\n";
  cout<<"In Snapdeal Rs."<<sp<<"\n";
  cout<<"In Amazon Rs."<<ap<<"\n";
  if(fp<=sp && fp<=ap)
    cout<<"He will prefer Flipkart";
  else if(sp<=ap)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";//Type your code here.
}