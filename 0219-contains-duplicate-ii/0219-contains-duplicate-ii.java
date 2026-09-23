class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        

        int n=nums.length;
        HashMap<Integer,Integer> res=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(res.containsKey(nums[i]) && i-res.get(nums[i])<=k)
            {
                return true;
            }
            res.put(nums[i],i);
        }
        return false;
    }
}