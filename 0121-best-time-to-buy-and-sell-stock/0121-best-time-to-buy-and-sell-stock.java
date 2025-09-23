class Solution {
    public int maxProfit(int[] nums) {
        // Stack<Integer> m = new Stack<>();
        int r= nums.length-1;
        int l = r-1;
        int maxi = 0;
        while(l>=0){
            if (nums[l]>nums[r]) {
                r = l;
                l-=1;
                continue;
            }
            maxi = Math.max(maxi,nums[r]-nums[l]);
            l-=1;
        }
        return maxi;
}
}