class Solution
{
public:
   int mod=1000000007;
    int ways(int x, int y)
    {
        //code here.
        vector<vector<int>>dp(x+1,vector<int>(y+1,-1));
        if(x==0 || y==0) return 1;
        for(int i=0;i<=x;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<=y;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                dp[i][j]=dp[i-1][j]%mod+dp[i][j-1]%mod;
            }
        }
        return dp[x][y]%mod;
    }
};
