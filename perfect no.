class Solution {
  public:
    int isPerfectNumber(long long N) {
        if(N==1) return 0;
        long long sum=1;
        for(long long i=2;i*i<=N;i++){
            if(N%i==0){
                sum += i;
                if(N/i != i){
                    sum += N/i;
                }
            }
        }
        return sum==N;
    }
};
