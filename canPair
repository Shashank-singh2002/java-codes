class Solution {
  public:
    bool canPair(vector<int> nums, int k) {
        vector<int> mp(k, 0);
        int n = nums.size();
        for(int i = 0; i < n; i++)
            mp[nums[i] % k]++;
        if(mp[0] % 2)
            return false;
        for(int i = 1; i < k; i++)
        {
            if(mp[i] != mp[k - i])
                return false;
        }
        return true;
    }
};
