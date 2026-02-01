class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        int l = 0;
        while (l< a.length){
            while( l<a.length && a[l] <0 && st.size() !=0 && st.peek()>0){
                // if(st.peek() )
                if(st.peek() > -(a[l])){
                    l++;
                }
                else if(st.peek() == -(a[l])){
                 l++;
                 st.pop();
                }
                else{
                    st.pop();
                }
            }

            if(l<a.length){st.push(a[l]);}
            l++;
            // System.out.print(st);
        }
        
        int[] arr = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            arr[i] = st.get(i);
            }
        return arr;
    }
}