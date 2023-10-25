class Solution{
public:
    int knapSack(int N, int W, int val[], int wt[])
    {
        int arr1[W+1], arr2[W+1];
        int* a = arr1;
        int* b = arr2;
        for(int &i:arr2)
            i = 0;
        for( int i=0;i<N;i++){
            int lim = min(W+1,wt[i]);
            for(int j=0;j<lim;j++)
                a[j] = b[j];
            for(int j=lim;j<=W;j++)
                a[j] = max ( val[i]+ a[j-wt[i]], b[j]);
            swap(a,b);
        }
        return b[W];
    }
};
