class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int[] res = new int[len+1]; 
        int sum = 0;
        int a = Integer.MIN_VALUE;
        res[0] = 0;
        for (int i = 1; i < len+1; i++) {
            sum += gain[i-1];
            res[i] = sum;
        }
        for (int i = 0; i < res.length; i++) {
            if(a < res[i]) {
                a = res[i];
            }
        }
        return a;
    }
}
