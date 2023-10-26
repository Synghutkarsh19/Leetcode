class Solution {
    public int minimumSum(int num) {
        int[] digi = new int[4];
        for(int i = 0; i<4; i++){
            int rem = num%10;
            digi[i] = rem;
            num = (num-rem)/10;
        }

        Arrays.sort(digi);
        int num1 = digi[0]*10+digi[3];
        int num2 = digi[1]*10+digi[2];

        return num1+num2;
    }
}