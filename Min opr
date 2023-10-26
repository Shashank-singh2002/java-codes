class Solution
{
  public:
    int minOperation(int n)
    {
        int count = 1;
        
        while(n!=1)
        {
           if(n%2 == 1)
           {
               count++;
               n = n-1;
           }
           
           n = n/2;
           count++;
            
        }
        
       return count;
    }
};
