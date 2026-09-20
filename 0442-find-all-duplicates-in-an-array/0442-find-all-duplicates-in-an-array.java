class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer, Integer>freq=new HashMap<>();

        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if(freq.containsKey(nums[i]))
            {
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }

        ArrayList<Integer> res=new ArrayList<>();

        for(int key : freq.keySet())
        {
            if(freq.get(key)>1)
            {
                res.add(key);
            }
        }
        return res;
    }
}