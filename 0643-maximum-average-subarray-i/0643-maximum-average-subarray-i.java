class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double currSum =0;
        double maxSum = 0;
        for(int i=0; i<k; i++){
            currSum += nums[i];
            maxSum = currSum;
        }
        for(int i=k; i<n; i++){
            currSum = currSum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum/k;
    }
}