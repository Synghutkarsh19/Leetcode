class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            String[] counter = sentences[i].split(" ");
            max = Math.max(max,counter.length);
        }
        return max;
    }
}