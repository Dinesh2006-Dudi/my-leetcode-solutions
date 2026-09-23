class Solution {
    public int maxSubArray(int[] nums) {
        
        int csum=nums[0];
        int msum=nums[0];

        int n=nums.length;

        for(int i=1;i<n;i++)
        {
            csum=Math.max(nums[i],csum+nums[i]);
            msum=Math.max(msum,csum);
        }
        return msum;
    }
}