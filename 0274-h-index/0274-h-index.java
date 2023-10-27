class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int count = 0;
        for(int i = 0; i<c.length-count; i++){
            if(c[i] != count){
                count = Math.max(count,Math.min(c[i],c.length-i));
            }
        }

        return count;
    }
}