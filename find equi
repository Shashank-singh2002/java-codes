class Solution{
    public:
    // Function to find equilibrium point in the array.
    // a: input array
    // n: size of array
    int equilibriumPoint(long long a[], int n) {
    
        long long sum=0;
    long long crsum=0;
    for(int i=0;i<n;i++)
    sum=sum+a[i];
    
    for(int i=0;i<n;i++)
    {
        sum=sum-a[i];
        if(crsum==sum)
        return i+1;
        crsum=crsum+a[i];
    }
    return -1;
    }

};
