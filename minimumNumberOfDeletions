class Solution{
  public:
     int minimumNumberOfDeletions(string s) { 
        int n = s.size();
        vector<vector<int>> dp(n + 1,vector<int>(n + 1,-1));
        string s2 = s;
        reverse(s2.begin(),s2.end());
        
        int lps = solve(s2,s,dp,n,n);
        return s.size() - lps;
    }
    int solve(string &s2,string &s1,vector<vector<int>> &dp,int n1,int n2){
        if(n1==0 or n2==0){
            return 0;
        }
        if(dp[n1][n2]!=-1){
            return dp[n1][n2];
        }
        if(s1[n1 - 1]==s2[n2 - 1]){
            return dp[n1][n2] = 1 + solve(s2,s1,dp,n1 - 1,n2 - 1);
        }
        return dp[n1][n2] = max(solve(s2,s1,dp,n1 - 1,n2),solve(s2,s1,dp,n1,n2 - 1));
    }
};
