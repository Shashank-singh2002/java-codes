class Solution
{
    public:
    queue<int> rev(queue<int> q)
    {
        int n= q.size();
        queue<int> q2;
        vector<int> v(n);
        for(int i=0;i<n;i++){
            int fr = q.front();
            q.pop();
            
            v[i] = fr;
        }
        for(int i=n-1;i>=0;i--){
            q2.push(v[i]);
        }
        return q2;
    }
};
