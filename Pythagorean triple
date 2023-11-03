class Solution{
public:
 // Function to check if the
 // Pythagorean triplet exists or not
 bool checkTriplet(int arr[], int n) {
 vector<int>v(1001,0);
    for(int i=0;i<n;i++)v[arr[i]]=1;
    for(int i=1;i<1000;i++){
        if(v[i]){
            for(int j=i+1;j<1000;j++){
                if(v[j]){
                    int sum=i*i+j*j;
                    double root=sqrt(sum);
                    if(root<=1000 && floor(root)==ceil(root) && v[int(root)])return 1;
                }
            }
        }
    }
    return 0;
 }
};
