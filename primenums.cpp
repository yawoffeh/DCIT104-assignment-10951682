//I certify that I yaw offeh dansoh did this work.
//Student-Id: 10951682
#include <iostream>
using namespace std;

bool isPrime(int num){
  for (int i=2; i<num; i++){
    if (num%i == 0){
      return false;
    }
  }
  return true;
}

int main(){
  int range;
  printf("Please enter the range \n");
  cin>>range;
  int sum = 0;
  for (int i=1; i<range; i++){
    bool prime = isPrime(i);
    if (prime){
      sum+= i;
    }
  }

  cout<<"The sum of the primenums within the range 0--"<<range<<" is "<<sum<<endl;
}
