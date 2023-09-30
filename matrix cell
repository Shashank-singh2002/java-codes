class Solution
{   
    public:
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(vector<vector<int> > &matrix)
    {
        int n = matrix.size(), m = matrix[0].size();
        bool firstRow = false, firstCol = false;
        
        for(int c = 0; c < m; c++)
            if(matrix[0][c] == 1) firstRow = true;
        for(int r = 0; r < n; r++)
            if(matrix[r][0] == 1) firstCol = true;
        
        for(int i = 1; i < n; i++) 
            for(int j = 1; j < m; j++)
                if(matrix[i][j])
                    matrix[0][j] = matrix[i][0] = 1;
        for(int i = 1; i < n; i++)
            for(int j = 1; j < m; j++)
                if(matrix[i][0] || matrix[0][j])
                    matrix[i][j] = 1;
        
        if(firstRow)
            for(int c = 0; c < m; c++) 
                matrix[0][c] = 1;
        if(firstCol)
            for(int r = 0; r < n; r++)
                matrix[r][0] = 1;
    }
};
