class Solution {
  public:
    int smithNum(int n) {
        int sum = 0;
        int num =n;
        vector<int> primes;
        for(int i =2;i< n;i++){
            while(num%i == 0){
                primes.push_back(i);
                num/=i;
            }
        }
        num =0;
        while(n){
            int digit = n%10;
            num+=digit;
            n/=10;
        }
        for(int i =0;i< primes.size();i++){
            while(primes[i]){
                int digit =primes[i]%10;
                sum+=digit;
                primes[i]/=10;
            }
        }
        return num == sum;
    }
};
