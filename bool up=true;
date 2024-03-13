class Solution{
  public:
    vector<int> matrixDiagonally(vector<vector<int>>&mat)
    {
         int n=mat.size();
        vector<int> ans(n*n,0);
        int k=0;
        
        bool up=true;
        int r=0,c=0;
        while(r<n && c<n){
            if(up){
                while(r>0 && c<n-1){
                    ans[k++]=mat[r][c];
                    r--;
                    c++;
                    
                }
                ans[k++]=mat[r][c];
                if(c==n-1)
                    r++;
                else
                    c++;
            }
            else{
                while(c>0 && r<n-1){
                    ans[k++]=mat[r][c];
                    r++;
                    c--;
                    
                }
                ans[k++]=mat[r][c];
                if(r==n-1)
                    c++;
                else
                    r++;
            }
            up=!up;
        }
        
        return(ans);
    }
};
