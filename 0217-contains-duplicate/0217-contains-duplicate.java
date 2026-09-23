class Solution {
    public boolean containsDuplicate(int[] nums) {
        

        int n=nums.length;
     HashSet<Integer> res=new HashSet<>();

     for(int i=0;i<n;i++)
     {
        if(res.contains(nums[i]))
        {
            return true;
        }
        else{
            res.add(nums[i]);
        }
     }
     return false;

    }
}