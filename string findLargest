class Solution{
public:
    string findLargest(int N, int S){
        if(N>1 && S==0){
            return "-1";
        }
        string ans="";
        while(N>0){
            if(S>=9){
                ans += "9";
                S -= 9;
            }
            else{
                ans += char(S+'0');
                S -= S;
            }
            N--;
        }
        if(S==0)
        return ans;
        
        return "-1";
    }
};
