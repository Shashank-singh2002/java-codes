class Solution
{
    public:
    int peakElement(int arr[], int n)
    {
       int ans=0;
       for(int i=0;i<n;i++){
           if(arr[i]>arr[i+1]){
              ans=i;
              break;
           }
          else if(arr[i]>arr[i-1]){
              ans=i;
          }
       }
       return ans;
    }
};
