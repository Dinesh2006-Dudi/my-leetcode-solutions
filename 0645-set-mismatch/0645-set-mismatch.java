class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();

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

       int dupl=0;
       int miss=0;

       for(int i=1;i<=n;i++)
       {
            if(freq.containsKey(i))
            {
                if(freq.get(i)>1)
                {
                    dupl=i;
                }
            }
            else{
                miss=i;
            }
       }

       return new int[]{dupl,miss};


    }
}