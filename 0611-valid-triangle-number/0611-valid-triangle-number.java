class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int k=j+1;

                while(k<nums.length && nums[i]+nums[j]>nums[k])
                {
                ans++;
                k++;
                }

            }
        }
        return ans;

    }
}