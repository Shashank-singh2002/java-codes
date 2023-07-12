class Solution{
    public:
    //You need to complete this fucntion
    #define mod 1000000007
    long long power(long long a,long long b){
        long long ans=1;
        while(b){
            if(b & 1) ans=(ans*a)%mod;
            a=(a*a)%mod;
            b>>=1;
        }
        return ans;
    }
    
    long long power(int N,int R)
    {
       return (power(N,R)%mod);
        
