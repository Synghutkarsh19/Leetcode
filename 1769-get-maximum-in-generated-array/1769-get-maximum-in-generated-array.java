class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            if(i%2 == 0){
                int x = i/2;
                dp[i] = dp[x];
            }
            else{
                int x = (i-1)/2;
                int y = x+1;
                dp[i] = dp[x]+dp[y];
            }
        }
        Arrays.sort(dp);
        return dp[n];
    }
}