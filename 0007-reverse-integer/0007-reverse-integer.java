class Solution {
    public int reverse(int x) {
       Integer k = x;
       double l = 0;
       while (Math.abs(x)>0){
       
        l = (l*10) + (x%10);
        x = x/10;

       }
        if ((-(int)(Math.pow(-2,31))) > l || (l> (int)(Math.pow(2,31))))
               {
                       return 0;
                              }
       return (int)l;
    }
}