class Solution {
    public boolean isPalindrome(String s) {
    s=  s.replaceAll("[^a-zA-Z0-9]", "");
     
         s = s.toLowerCase();
         if(s.length() == 0 || s == null){
             return true;
         }
        for (int i = 0; i < s.length()/2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start != end){
                return false;
            }

        }
        return true;
    }
}
//Leetcode easy : 125
