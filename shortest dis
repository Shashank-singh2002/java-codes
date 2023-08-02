class Solution {
  public:
    int shortestDistance(int N, int M, vector<vector<int>> A, int X, int Y) {
        priority_queue<pair<int, pair<int, int>>, vector<pair<int, pair<int, int>>>, greater<pair<int, pair<int, int>>>> pq;
        pq.push({0, {0, 0}});
        vector<vector<int>> vis(N, vector<int>(M, 0));
        vis[0][0]=1;
        int di[]={0, -1, 0, 1};
        int dj[]={-1, 0, 1, 0};
        while(!pq.empty()){
            int steps = pq.top().first;
            int x = pq.top().second.first;
            int y = pq.top().second.second;
            pq.pop();
            
            if(x==X && y==Y){
                return steps;
            }
            
            for(int i=0;i<4;i++){
                int dx = x + di[i];
                int dy = y + dj[i];
                
                if(dx>=0 && dx<N && dy>=0 && dy<M && A[dx][dy]==1 && vis[dx][dy]==0){
                    vis[dx][dy]=1;
                    pq.push({steps+1,{dx, dy}});
                }
            }
            
        }
        return -1;
    }
};
