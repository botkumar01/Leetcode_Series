class Solution {
    public boolean rotateString(String s, String goal) {
        String jn = s+s;
        int n = s.length();
        for(int i=0;i<s.length()+1;i++){
            String k =jn.substring(i,i+n);
            System.out.println(k);
            System.out.println(k == goal);
            if(k.equals(goal)){
                return true;
            }

        }
        return false;
    }
}