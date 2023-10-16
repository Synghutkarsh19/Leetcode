class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        String test = String.valueOf(x);
        for(int i=0; i<=test.length()/2; i++){
            if(test.charAt(i) != test.charAt(test.length()-1-i)) return false;
        }
        return true;
        
        // if(x%11 != 0) return false;
        // return true;
    }
}