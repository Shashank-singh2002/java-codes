class Solution
{
    public:
    //Function to find position of first set bit in the given number.
    unsigned int getFirstSetBit(int n)
    {
        unsigned int cnt=1;
        while(n>0){
            if(n&1){
                return cnt;
            }
            n = n>>1;
            cnt++;
        }
        return 0;
    }
};
