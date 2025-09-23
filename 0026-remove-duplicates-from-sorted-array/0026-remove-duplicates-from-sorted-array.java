class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r =1;
        while (r<nums.length){
            if(nums[l]!=nums[r]){
                l+=1;
                int temp = nums[l];
                nums[l]=nums[r];
                nums[r] = temp;
                // r+=1
            }
            r+=1;
        }
        return l+1;
    }
}