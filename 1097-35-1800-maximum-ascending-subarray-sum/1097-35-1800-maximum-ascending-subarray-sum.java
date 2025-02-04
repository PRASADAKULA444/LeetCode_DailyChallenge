class Solution {
    public int maxAscendingSum(int[] nums) {
        int inc_sum = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                inc_sum += nums[i];
            }else{
                inc_sum = nums[i];
            }
            ans = Math.max(ans,inc_sum);
        }
        return ans;
    }
}