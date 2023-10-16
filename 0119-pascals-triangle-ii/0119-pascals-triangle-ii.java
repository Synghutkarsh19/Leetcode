class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<=rowIndex; i++){
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            for(int j = 1; j<i; j++){
                arr.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            if(i>0) arr.add(1);
            res.add(arr);
        }
        return res.get(rowIndex);
    }
}