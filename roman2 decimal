class Solution {
  public:
    int romanToDecimal(string &str) {
        unordered_map<char,int>mp;
        mp['I']=1;
        mp['V']=5;
        mp['X']=10;
        mp['L']=50;
        mp['C']=100;
        mp['D']=500;
        mp['M']=1000;
       int sum=0;
       int pre=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(mp[str[i]] < pre) sum-=mp[str[i]];
            else sum+=mp[str[i]];
            pre=mp[str[i]];
        }
        return sum;
    }
};
