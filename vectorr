class Solution{
public:
    
    void dfs(int row, int col, vector<vector<char>>& mat, vector<vector<int>>& vis, int n, int m){
        vis[row][col] = 1;
        int ra[] = {-1, 0, 1, 0};
        int rc[] = {0, 1, 0, -1};
        for(int i=0;i<4;i++){
            int r = row+ra[i];
            int c = col + rc[i];
            
            if(r>=0 && r<n && c>=0 && c<m && !vis[r][c] && mat[r][c] == 'O'){
                dfs(r, c, mat, vis, n ,m);
            }
        }
    }
    vector<vector<char>> fill(int n, int m, vector<vector<char>> mat)
    {
        vector<vector<int>> vis(n, vector<int>(m, 0));
        
        for(int i=0;i<m;i++){
            if(mat[0][i]=='O' && !vis[0][i]){
                dfs(0, i, mat, vis, n, m);
            }
            if(mat[n-1][i]=='O' && !vis[n-1][i]){
                dfs(n-1, i, mat, vis, n, m);
            }
        }
        
        for(int i=0;i<n;i++){
            if(mat[i][0]=='O' && !vis[i][0]){
                dfs(i, 0, mat, vis, n, m);
            }
            if(mat[i][m-1]=='O' && !vis[i][m-1]){
                dfs(i, m-1, mat, vis, n, m);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && mat[i][j] == 'O'){
                    mat[i][j] = 'X';
                }
            }
        }
        
        return mat;
    }
};
