class Solution{
public:
    vector<vector<int>> transitiveClosure(int N, vector<vector<int>> graph)
    {
           for(int via = 0; via < N; via++) 
            for(int src = 0; src < N; src++)
                for(int dest = 0; dest < N; dest++)
                    if(graph[src][via] && graph[via][dest] || src == dest)
                        graph[src][dest] = 1;
        return graph;
    }
};
