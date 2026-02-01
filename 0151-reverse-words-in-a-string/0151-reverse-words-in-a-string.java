class Solution {
    public String reverseWords(String s) {
        int l=0;
        StringBuilder one = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(;l<s.length();){
            while(l<s.length() && s.charAt(l) == ' '){
                // System.out.println(one);

                if (one.length() != 0){
                    if(ans.length() == 0){
                        System.out.println("d");
                    ans.insert(0,one);
                    }
                    // ans.insert(0," ");
                    else {
                                        // System.out.println(one.toString());
                        // System.out.println("d");

                        ans.insert(0," ");
                        ans.insert(0,one);
                    
                    }
                    
                    one.setLength(0);
                }
                l++;
            }
            while(l<s.length() && (s.charAt(l) != ' ')){
                one.append(s.charAt(l));
                l++;
                
            }
            // System.out.println(ans);
            // l++;
        }
                        // System.out.println(one);

        if(one.length() !=0){
            if(ans.length() !=0){
                ans.insert(0," ");
            }
        ans.insert(0,one);
        }
        return ans.toString();
    }
}