class Solution {
  public:
    int singleElement(int arr[] ,int N) {
        sort(arr, arr + N);
        for(int i=0;i<N;i += 3){
            if (arr[i]!=arr[i+2]){
                return arr[i];
            } 
        }
    }
};
