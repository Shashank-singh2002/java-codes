class Solution
{   
    public:
    //Function to return sum of upper and lower triangles of a matrix.
    vector<int> sumTriangles(const vector<vector<int> >& matrix, int n)
    {
         int a=0,b=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                a+=matrix[i][j];
                b+=matrix[n-1-i][n-1-j];
            }
        }
        return {a,b};
    }
};
