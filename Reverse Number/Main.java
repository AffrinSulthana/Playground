#include <iostream>
using namespace std;
int main() 
{
	int num, dig, rev=0;
    cin>>num;
    while(num>0)
    {
      dig=num%10;
      num=num/10;
      rev=rev*10+dig;
      
    }
  cout<<rev;// Type your code here
	return 0;
}