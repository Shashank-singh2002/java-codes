class Solution{
  public:
    char nthCharacter(string s, int r, int n) {
        string temp = s;
        for (int i = 0;i < r; i++) {
            string ans =  "";
            for (auto j :temp) {
                if (j == '1') ans += "10";
                else ans += "01";
                if (ans.size()>n) break;
            }
            temp = ans;
        }
        
        return temp[n];
    }
};
