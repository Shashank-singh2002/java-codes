class Solution {
  public:
    int minimumMultiplications(vector<int>& arr, int start, int end) {
        queue<pair<int,int>> pq;
        pq.push({start,0});
        vector<int> dis(100000,1e9);
        
        int m=1e5;
        while(!pq.empty()){
            
            int num=pq.front().first;
            int level=pq.front().second;
            pq.pop(); 
            
            if(num==end)
                return level;
                    
            for(auto &it:arr){
                int n=((num%100000)*(it%100000))%m;
                if(level+1<dis[n]){ 
                    dis[n]=level+1;
                    pq.push({n,level+1});
                }
            }
        }
        
        if(dis[end]==1e9)
        return -1;
        
        return dis[end];
    }
};
