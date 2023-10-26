class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            max = Math.max(max,candies[i]);
            candies[i]+=extraCandies;
        }
        List<Boolean> res = new ArrayList<>();
        for(int i: candies){
            if(i>=max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}