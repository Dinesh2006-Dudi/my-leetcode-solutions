class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;

        int []res=new int[n];

        for(int i=0;i<n;i++)
        {
            arr.add(index[i],nums[i]);
        }

        for(int i=0;i<n;i++)
        {
            res[i]=arr.get(i);
        }
        return res;
        
    }
}