class Solution {
    public int maxProfit(int[] p) {
        int res = 0;
        for(int i = 0; i<p.length-1; i++){
            if((p[i+1]-p[i])>0) res+=(p[i+1]-p[i]);
        }
        return res;
    }
}