class Solution{
  public:
    vector<int> duplicates(int arr[], int n) {
         vector<int>v; 
         int flag = 0;
       sort(arr,arr+n);
       for(int i=0; i<n; i++) {
           if(arr[i] == arr[i+1]) {
               flag++;
               if(flag == 1) {
                   v.push_back(arr[i]);
               }
           }
           else {
               flag = 0;
           }
       }
       if(v.size() > 0) return v;
       return {-1};
    }
};
