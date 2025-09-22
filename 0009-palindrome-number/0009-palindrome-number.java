class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String s = new StringBuilder(String.valueOf(x)).reverse().toString();
        System.out.print(s);
        return s.equals(String.valueOf(x));
    }
}