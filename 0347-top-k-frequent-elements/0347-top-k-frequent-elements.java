class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;

        HashMap<Integer,Integer> freq=new HashMap<>();

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
        


       ArrayList<Integer> list =new ArrayList<>(freq.keySet());

        list.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}