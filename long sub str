class Solution{
  public:
    int longestKSubstr(string s, int k) {
      int maxi = -1e9;
      unordered_map<char, int> mp;
      int n = s.size();
      int i=0;
      for(int j=0;j<n;j++){
          mp[s[j]]++;
          if(mp.size()==k){
              maxi = max(maxi, j-i+1);
          }
          else if(mp.size()>k){
              while(mp.size()>k){
                  mp[s[i]]--;
                  if(mp[s[i]]==0){
                      mp.erase(s[i]);
                  }
                  i++;
              }
          }
      }
      if(maxi==-1e9){
          return -1;
      }
      return maxi;
    }
};
