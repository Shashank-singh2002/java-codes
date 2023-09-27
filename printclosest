class Solution{
  public:
    vector<int> printClosest(int arr[], int brr[], int n, int m, int x) {
        vector<int>v;
       int i=0,j=m-1;
       int res=INT_MAX;
         while(i<n and j>=0){
         if((x-arr[i]-brr[j])<0){
             res=min(res,abs(x-arr[i]-brr[j]));
            j--;
         }
        else if((x-arr[i]-brr[j])>=0){
            res=min(res,(x-arr[i]-brr[j]));
            i++;
        } 
       }
       res=x-res;
       v.push_back(res);
       return v;
    }
};
