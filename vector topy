class Solution {
  public:
    vector<int> topK(vector<int>& nums, int k) {
        priority_queue <pair<int,int>> pq;
        unordered_map <int,int> map;
        vector<int> ans;
        for (auto i : nums) {
            map[i]++;
        }
        for (auto i : map) {
            pq.push({i.second,i.first});
        }
        while (k--) {
            ans.push_back(pq.top().second);
            pq.pop();
        }
        return ans;
    }
};
