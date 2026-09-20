class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer, Integer>freq=new HashMap<>();

        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if(freq.containsKey(nums[i]))
            {
                return nums[i];
            }
            else{
                freq.put(nums[i],1);
            }
        }
        return -1;
    }
}