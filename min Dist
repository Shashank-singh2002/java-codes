class Solution{
  public:
    int minDist(int a[], int n, int x, int y) {
         int ans=INT_MAX;
        int x1=-1;
        int y1=-1;
        
        for(int i=0;i<n;i++){
            if(a[i]==x){
                if(y1!=-1){
                    int d=abs(i-y1);
                    ans=min(ans,d);
                }
                x1=i;
            }
              if(a[i]==y){
                if(x1!=-1){
                    int d=abs(i-x1);
                    ans=min(ans,d);
                }
               y1=i;
            }
        }
        return ans==INT_MAX?-1:ans;
    }
};
