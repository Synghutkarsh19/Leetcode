class Solution {
    public boolean isPowerOfFour(int n) {
        int i = 0;
        while(i<n){
            double test = Math.pow(4,i);
            if(test>n) return false;
            else if(test == n) return true;
            else i++;
        }
        return false;
    }
}