package LeetCode;
//https://leetcode.com/problems/shuffle-string/
public class SuffleString {
    public static void main(String[] args) {
    String s ="codeleet";
    int [] indeces = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indeces));
    }
    static String restoreString(String s, int[] indices) {
    char [] ch= new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[indices[i]]=s.charAt(i);
        }
return String.valueOf(ch);
    }
}
//the idea is create a char array of size string, than character
//of index i should be each char of i;
//than simply return the value of char.