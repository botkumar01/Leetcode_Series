import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Collections.sort(Arrays.asList(strs));
        // return strs[0];
        for(int i=1; i<=strs[0].length();i++){
            String p = new String (strs[0].substring(0,i));
            for(String x : strs){
                if (!(x.substring(0,i).equals(p))){
                    // if(i==0){
                    //     return"";
                    // }
                    return strs[0].substring(0,i-1);
                }
            }
           
        }
         return strs[0];
    }
}