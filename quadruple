class Solution{
    public:
    // arr[] : int input array of integers
    // k : the quadruple sum required
    vector<vector<int> > fourSum(vector<int> &arr, int k) {
        int n=arr.size();
         vector<vector<int> >res;
       sort(arr.begin(),arr.end());
       for(int i=0;i<n-3;i++)
       {
           if(i>0 and arr[i]==arr[i-1])
               continue;
        for(int j=i+1;j<n-2;j++)
        {
            if(j>i+1 and arr[j]==arr[j-1])
              continue;
            int l=j+1;
            int r=n-1;
            while(r>l)
            {
                if(arr[i]+arr[j]+arr[l]+arr[r]==k)
                {
                    res.push_back({arr[i],arr[j],arr[l],arr[r]});
                    l++;r--;
                    while(l<r and arr[l]==arr[l-1]) l++;
                    while(l<r and arr[r]==arr[r+1])r--;
                }
                    
                else if(arr[i]+arr[j]+arr[l]+arr[r]>k)
                    r--;
                else
                    l++;
            }
        }
       }
       return res;
    }
};
