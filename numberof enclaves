class Solution {
  public:
    int numberOfEnclaves(vector<vector<int>> &grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> vis(n, vector<int>(m, 0));
        queue<pair<int, int>> q;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 or j==0 or i==n-1 or j==m-1){
                    if(grid[i][j]==1){
                    q.push({i, j});
                    vis[i][j]=1;
                    }
                }
            }
        }
        
        
        int ra[] = {-1, 0, 1, 0};
        int ca[] = {0, 1, 0, -1};
        
        while(!q.empty()){
            int r = q.front().first;
            int c = q.front().second;
            q.pop();
            
            
            for(int i=0;i<4;i++){
                int row = r+ra[i];
                int col = c+ca[i];
                
                
                if(row>=0 && row<n && col>=0 && col<m && !vis[row][col] && grid[row][col]==1){
                    vis[row][col] = 1;
                    q.push({row, col});
                }
            }
        }
        
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
};
