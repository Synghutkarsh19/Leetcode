class Solution {
    public boolean canConstruct(String r, String m) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i = 0; i<m.length(); i++){
        //     char ch = m.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch, map.get(ch)+1);
        //     }
        //     else{
        //         map.put(ch,1);
        //     }
        // }
        // boolean res = true;
        // for(int i = 0; i<r.length(); i++){
        //     char test = r.charAt(i);
        //     if(map.containsKey(test)){
        //         if(map.get(test)>0){
        //             map.put(test, map.get(test)-1); 
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;

        if(r.length()>m.length()) return false;
        int[] al = new int[26];
        for(int i = 0; i<m.length(); i++){
            char c = m.charAt(i);
            al[c - 'a']++;
        }

        for(int i = 0; i<r.length(); i++){
            char test = r.charAt(i);
            if(al[test-'a'] != 0){
                al[test-'a']--;
            }
            else return false;
        }
        return true;
    }
}