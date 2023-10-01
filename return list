class Solution
{   
    public:
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    vector<int> boundaryTraversal(vector<vector<int> > matrix, int n, int m) 
    {
        vector<int> ans;
        int row=0;
        int col=0;
        while(col <m)ans.push_back(matrix[row][col++]);
        row++;
        col--;
        while(row <n)ans.push_back(matrix[row++][col]);
        col--;
        row--;
        while(col >=0 && n!=1)ans.push_back(matrix[row][col--]);
        row--;
        col++;
        while(row >0 && m!=1)ans.push_back(matrix[row--][col]);
        
        return ans;
    }
};
