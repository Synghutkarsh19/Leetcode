class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int res = 0;
        // int j = n-2;
        // for(int i = 0; i<n/2; i+=2){
        //     System.out.println(piles[j]);
        //     res += piles[j];
        //     j-=2;
        // }

        for(int i = n/3; i<n; i+=2){
            res+=piles[i];
        }

        // 1,2,3,4,5,6,7,8,9

        return res;
    }
}