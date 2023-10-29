class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ", "");
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i<key.length(); i++){
            if(!arr.contains(key.charAt(i)))arr.add(key.charAt(i));
        }

        String res = "";
        for(int i = 0;i < message.length(); i++){
            if(message.charAt(i) == ' '){
                res+= " ";
                continue;
            }
            int ascii = arr.indexOf(message.charAt(i))+97;
            char ch = (char) ascii;
            res+=String.valueOf(ch);

        }

        return res;
    }
}