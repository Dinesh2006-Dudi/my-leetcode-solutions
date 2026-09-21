class Solution {
    public int thirdMax(int[] nums) {
       Set<Integer> arr=new HashSet<>();

       for(int n:nums)
       {
            arr.add(n);
       }

       if(arr.size()>=3)
       {
            arr.remove(Collections.max(arr));
            arr.remove(Collections.max(arr));
       }
       return Collections.max(arr);
    }
}