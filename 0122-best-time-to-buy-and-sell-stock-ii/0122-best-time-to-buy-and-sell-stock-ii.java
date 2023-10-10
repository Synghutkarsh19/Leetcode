class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int res = 0;
        for(int i = 0; i<n-1; i++){
            int def = p[i+1]-p[i];
            if(def>0) res+=def;
        }

        return res;
    }
}