class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int X=0;
        for(int i = 0; i<n; i++){
            if(operations[i].contains("--")){
                X--;
            }
            else if(operations[i].contains("++")){
                X++;
            }
        }

        return X;
    }
}