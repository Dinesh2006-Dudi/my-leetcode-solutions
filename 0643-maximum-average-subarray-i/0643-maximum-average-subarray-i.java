class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
        double w_sum=0;

        for(int i=0;i<k;i++)
        {
            w_sum+=nums[i];
        }

        double max_sum=w_sum;

        for(int i=k;i<nums.length;i++)
        {
            w_sum=w_sum-nums[i-k]+nums[i];

            max_sum=Math.max(max_sum,w_sum);
        }

        return max_sum /k;
    }
}