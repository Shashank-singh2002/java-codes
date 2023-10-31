class Solution{
public:
 void pushZerosToEnd(int arr[], int n) {
     vector<int>v;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            v.push_back(arr[i]);
            
            else
            count++;
        }
        for(int i=0;i<count;i++)
        v.push_back(0);
        for(int i=0;i<n;i++)
        arr[i]=v[i];

       }
};
