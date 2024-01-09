class Solution
{
    public:
        vector <int> search(string pat, string txt)
        {
            vector<int> ans;
            int index = txt.find(pat, 0);
        
            while (index != string::npos) {
                ans.push_back(index + 1);
                index = txt.find(pat, index + 1); 
            }
        
            return ans;
        }
     
};
