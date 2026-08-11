class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int c_sum=nums[0];

        for(int i=1;i<n;i++)
        {
           if(nums[i]==nums[i-1]+1)
           {
           c_sum+=nums[i];
           }
           else{
            break;
           }
        }

            while(true)
            {
            boolean found=false;

            for(int num:nums)
            {
                if(num==c_sum)
                {
                found=true;
                break;
                }
            }
                if(!found)
                return c_sum;
            c_sum++;
    }
        }
        
}