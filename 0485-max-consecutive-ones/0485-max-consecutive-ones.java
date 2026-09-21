class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int len=0;
        for(int x:nums)

        {
            if(x==1)
            {
            count++;
            }
            else
            {
            count=0;
            }

            len=Math.max(len,count);
        }
        return len;
    }
}