class Solution{
    public:
    // Returns sum of bitwise OR
    // of all pairs
    long long int sumXOR(int arr[], int n)
    {
     vector<long long int>v(31,0);
     long long int ans=0;
     for(int i=0;i<n;i++)
     {
         long long int x=arr[i];
         for(int j=0;j<31;j++)
         {
             if(x%2)
             {
                 long long int a=i-v[j];
                 long long int res=a*(1<<j);
                 ans+=res;
                 v[j]++;
             }
             else
             {
                 long long int a=v[j];
                 long long int res=a*(1<<j);
                 ans+=res;
             }
             x/=2;
         }
     }
     return ans;
    }
};
