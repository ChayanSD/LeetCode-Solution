package LeetCode;

public class ReverseString2 {
    public static void main(String[] args) {
        String s ="abcdefg";
        int k =2;
        System.out.println(reverseStr(s,k));
    }
    static String reverseStr(String s, int k) {
     char [] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            int start = i;
            int end = Math.min(i+k-1,ch.length-1);
            while (start<end){
                char temp =ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
}
