class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int c_sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
            int p_sum=nums[i]+nums[j]+nums[k];

            if(Math.abs(target-p_sum)< Math.abs(target-c_sum))
            c_sum=p_sum;

            if(p_sum>target)
            k--;
            else
            j++;
            }
        }
        return c_sum;
    }
}