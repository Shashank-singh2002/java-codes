class Solution{
public:
    vector<long long> nthRowOfPascalTriangle(int n) {
        int mod = 1000000007;
        vector<vector<long long>> pT(n);
        for(int i=0;i<n;i++){
            pT[i].resize(i+1);
            pT[i][0] = pT[i][i] = 1;
            for(int j=1;j<i;j++){
                pT[i][j] = (pT[i-1][j] + pT[i-1][j-1])%mod;
            }
        }
        
        return pT[n-1];
    }
};
