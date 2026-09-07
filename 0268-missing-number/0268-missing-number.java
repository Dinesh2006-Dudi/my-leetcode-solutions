class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expsum=0;
        int actsum=0;

        for(int i=0;i<n;i++)
        {
            actsum+=nums[i];
        }
        expsum=(n*(n+1))/2;
        return expsum-actsum;

        
    }
}