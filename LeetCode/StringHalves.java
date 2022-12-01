//https://leetcode.com/problems/determine-if-string-halves-are-alike/

package leetCode;

import java.util.*;

public class Halves {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    String a = sc.next();
        System.out.println(halvesAreAlike(a));
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int vowelsCount = 0, midIndex = s.length() / 2;

        for (int i = 0; i < midIndex; i++) {
            char charA = s.charAt(i);
            char charB = s.charAt(midIndex + i);
            if (vowels.contains(charA)) vowelsCount++;
            if (vowels.contains(charB)) vowelsCount--;
        }
        return vowelsCount == 0;
    }
}
