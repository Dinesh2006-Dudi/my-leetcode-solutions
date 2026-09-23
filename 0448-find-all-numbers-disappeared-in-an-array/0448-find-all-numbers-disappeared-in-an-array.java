class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> res=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            res.add(nums[i]);
        }

        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            if(!res.contains(i))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}