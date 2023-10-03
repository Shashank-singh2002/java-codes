class Solution{
    public:
    string colName (long long int n)
    {
        string s="";
        while(n!=0){
            n=n-1;
            long long int first=n/26;
            long long int second=(n+1)-(26*first);
            s +='A'+second-1;
            n=first;
        }
        reverse(s.begin() , s.end());
        return s;
    }
};
