class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <String,String> mapp = new HashMap<>();
        int l = s.length();
        // int r = t.length();
        for(int r=0 ; r< s.length();r++){
            if(mapp.containsKey(String.valueOf(s.charAt(r))) && mapp.get(String.valueOf(s.charAt(r))).equals(String.valueOf(t.charAt(r)))){
                // l+=1;
                // r+=1;
                continue;
            }
            else if(mapp.containsValue(String.valueOf(t.charAt(r))) && !(mapp.containsKey(String.valueOf(s.charAt(r))))){
                return false;
            }
            else if(mapp.containsKey(String.valueOf(s.charAt(r))) && !(mapp.get(String.valueOf(s.charAt(r))).equals(String.valueOf(t.charAt(r))))){
                return false;
            }
    mapp.put(String.valueOf(s.charAt(r)), String.valueOf(t.charAt(r)));
            //     l+=1;
            // r+=1;
        }
        return true;
    }
}