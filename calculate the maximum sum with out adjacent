class Solution{
public: 
 // calculate the maximum sum with out adjacent
 int findMaxSum(int *arr, int n) {
     int a0=0,a1=arr[0];
     for(int i=1;i<n;i++){
         int val = max(arr[i]+a0,a1);
         a0=a1;
         a1=val;
     }
     return a1;
 }
};
