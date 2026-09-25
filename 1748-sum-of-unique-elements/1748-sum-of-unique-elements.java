class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> freq=new HashMap<>();

        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if(freq.containsKey(nums[i]))
            {
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else
            {
                freq.put(nums[i],1);
            }
        }
            int sum=0;
        for(int key:freq.keySet())
        {
            int cnt=freq.get(key);
            if(cnt==1)
            {
                sum+=key;
            }
        }
        return sum;

    }
}