class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int count = 0;
        boolean zero = false;
        int index = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                count++;
                zero = true;
                index = i;
            }
        }
        int[] res = new int[n];
        if(!zero){
            int prod = 1;
            for(int i: nums){
                prod *= i;
            }
            for(int i = 0; i<n; i++){
                res[i] = prod/nums[i];
            }
        }
        else{
            if(count>1){
                Arrays.fill(res, 0);
            }
            else{
                Arrays.fill(res, 0);
                int prod = 1;
                for(int i = 0; i<n; i++){
                    if(i!=index) prod*=nums[i];
                }

                res[index] = prod;
            }
        }

        return res;
    }
}