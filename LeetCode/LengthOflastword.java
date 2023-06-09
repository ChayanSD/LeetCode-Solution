public class LengthOflastword {
    public static void main(String[] args) {
      String s ="a";
        System.out.println(lengthOfLastWord(s));
      
    }
    public static int lengthOfLastWord(String s){
         s = s.trim(); //it will remove first and last space.
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length()-lastIndex;  
    }
}
//Leetcode 58
