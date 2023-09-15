class Solution{
public:
    int solve(int i, int sum, int N,int a[], vector<vector<int>>&dp){
     if( i >= N){
         if(sum == 0) return 1;
         return 0;
     }
     if(sum == 0) return 1;
     if(sum < 0) return 0;
     if(dp[i][sum] != -1) return dp[i][sum];
     int include = solve(i+1,sum-a[i],N,a,dp);
     int exclude = solve(i+1,sum,N,a,dp);
     return dp[i][sum] = include || exclude;
 }
    int equalPartition(int N, int arr[])
    {
        // code here
       
        int sum = 0;
        for(int i = 0 ;i<N;i++){
            sum += arr[i];
        }
         vector<vector<int>>dp(N+1,vector<int>(sum/2+1,-1));
        if(sum%2 != 0) return 0;
        return solve(0,sum/2,N,arr,dp);
        
    }
};
