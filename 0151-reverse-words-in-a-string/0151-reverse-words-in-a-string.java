import java.util.*;
class Solution {
    public String reverseWords(String s) {
        // String chh =(s.trim());
        String[] ch = s.trim().split("\\s+");
        // char[] k = ch.toCharArray();
        Collections.reverse(Arrays.asList(ch));
        // String l = new String(ch);
        return String.join(" ",ch);
    }
}