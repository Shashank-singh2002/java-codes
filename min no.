class Solution
{
    public:
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    int findMinOpeartion(vector<vector<int> > matrix, int n)
    {
        // code here 
        vector<int> v;
        int count=0;
        for(int i=0;i<matrix.size();i++){
            int sum=0;
            for(auto d: matrix[i]){
                sum+=d;
            }
            v.push_back(sum);
        }
        int s=*max_element(v.begin(),v.end());
        vector<int> v1;
        for(int i=0;i<matrix.size();i++){
            int sum1 = 0;
            for(int j=0;j<matrix.size();j++){
                sum1+=matrix[j][i];
            }
            v1.push_back(sum1);
        }
        int s1 = *max_element(v1.begin(),v1.end());
        int finalsum = max(s,s1);
        for(int i=0;i<matrix.size();i++){
            count+=(finalsum-v[i]);
        }
        return count;
    } 
};
