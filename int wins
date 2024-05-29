class Solution {
  public:
    int wins(int n, int &x, int &y, vector<int>& dp){
        if(n == 0){
            return 0;
        }
        else if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        ans |= (!(wins(n-1, x, y, dp)));
        if(n - x >= 0){
            ans |= (!(wins(n-x, x, y, dp)));
        }
        if(n - y >= 0){
            ans |= (!(wins(n-y, x, y, dp)));
        }
        return dp[n] = ans;
    }
    int findWinner(int n, int x, int y) {
        // code here
        vector<int>dp(n+1, -1);
        return wins(n, x, y, dp);
    }
};
