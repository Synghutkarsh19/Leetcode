class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int[] res = new int[n];
        for(int i = 0; i<n/2; i++){
            res[i] = nums[i];
            res[i+(n/2)] = nums[i];
        }

        return res;
    }
}