class Solution{
    public:
    long long M=1e9+7;
    long long countWays(int n, int k){
        if(n==1)return k;
        long long prev=0,curr=k;
        long long ans = prev+curr;
        for(int i=2;i<=n;i++){
            prev=curr;
            curr=(ans*(k-1))%M;
            ans=prev+curr;
        }
        return ans%M;
    }
};
