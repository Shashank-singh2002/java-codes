class Solution
{
    public:
    //Function to check if two strings are isomorphic.
    bool areIsomorphic(string str1, string str2)
    {
        
        if (str1.size() != str2.size())
        {
            return 0;
        }
        
        map<char, int> a, b;
        for(auto&x:str1)a[x]++;
        for(auto&x:str2)b[x]++;
        vector<int> aa, bb;
        for(auto&x:a)aa.push_back(x.second);
        for(auto&x:b)bb.push_back(x.second);
        sort(aa.begin(),aa.end());
        sort(bb.begin(),bb.end());
        if (aa != bb) return 0;
        
        map<char, char> m;
        for(int i=0; i<str1.size(); ++i)
        {
            m[str1[i]] = str2[i];
        }
        for(int i=0; i<str1.size(); ++i)
        {
            char c1 = str1[i];
            char c2 = str2[i];
            if (m[c1] != c2)
            {
                return 0;
            }
        }
        return 1;
        
    }
};
