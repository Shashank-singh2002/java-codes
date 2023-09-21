class Solution
{
    public:
    //Function to find the maximum money the thief can get.
    int solve(int index, int nums[], vector<int>& dp){
        if(index<0){
            return 0;
        }
        if(index==0){
            return nums[0];
        }
        
        if(dp[index] != -1){
            return dp[index];
        }
        
        int notSteal = 0 + solve(index-1, nums, dp);
        
        int steal = nums[index] + solve(index-2, nums, dp);
        
        return dp[index] = max(steal, notSteal);
    }
    
    int FindMaxSum(int arr[], int n)
    {
        vector<int> dp(n, -1);
        return solve(n-1, arr, dp);
    }
};
