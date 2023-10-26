class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int[] res = new int[n];

        for(int i = 0; i<n; i++){
            res[i] = candies[i];
        }

        Arrays.sort(res);

        int max = res[n-1];

        List<Boolean> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(max-candies[i] <= extraCandies) ans.add(true);
            else ans.add(false);
        }

        return ans;
    }
}