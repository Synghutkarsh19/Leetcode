class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        s = s.replaceAll(" + "," ");
        s = s.replaceAll(" ","");
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.length());
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}