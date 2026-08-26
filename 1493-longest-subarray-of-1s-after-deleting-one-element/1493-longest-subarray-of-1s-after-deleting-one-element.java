class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int n=nums.length;
        int maxlen=0;
        int zercnt=0;

        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
                zercnt++;
            }

            while(zercnt>1)
            {
                if(nums[left]==0)
                {
                    zercnt--;
                }
                left++;

            }
            maxlen=Math.max(maxlen,right-left+1-zercnt);
        }
        return (maxlen==n)?maxlen-1:maxlen;


    }
}