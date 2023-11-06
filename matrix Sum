class Solution{
public:
    vector<int> matrixSum(int n, int m, vector<vector<int>> mat, int q, vector<int> queries[])
    {
        vector<int> answer;
       int hop,sum,i,j;
       
       for(int k = 0; k < q; k++)
       {
           hop = queries[k][0];
           i = queries[k][1];
           j = queries[k][2];
           sum = 0;
           
            for(int ele = j-hop; ele <= j+hop ; ele++)
            {
                if(i-hop >=0 && ele >= 0 && ele <= m-1)
                {
                  sum = sum + mat[i-hop][ele]; 
                  
                }
                
                if(i+hop <= n-1 && ele >= 0 && ele <= m-1)
                {
                    
                    sum = sum + mat[i+hop][ele]; 
                    
                }
            }
            
            for(int ele = i-hop+1; ele <= i+hop-1 ; ele++)
            {
                if(j-hop >=0 && ele >= 0 && ele <= n-1)
                {
                  sum = sum + mat[ele][j-hop]; 
                  
                }
                if(j+hop <= m-1 && ele >= 0 && ele <= n-1)
                {
                  sum = sum + mat[ele][j+hop];
                  
                }
            }
            
            answer.push_back(sum); 
       }
       
       return answer;
    }
};
