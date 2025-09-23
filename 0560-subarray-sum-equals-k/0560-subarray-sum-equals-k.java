class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> s = new HashMap<>();
        s.put(0,1);
        int l =0;
        int ad =0;
        int cnt =0;
        while (l<nums.length){
            ad += nums[l];
            if (s.containsKey(ad-k)){
                cnt += s.get(ad-k);
            }
            if (s.containsKey(ad)){
                s.put(ad,s.get(ad)+1);
            }
            else{
                s.put(ad,1);
            }
            l+=1;
        }
        return cnt;
    }
}