class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length()){
            return false;
        }
        String l = s+s;
        return l.contains(g);
    }
}