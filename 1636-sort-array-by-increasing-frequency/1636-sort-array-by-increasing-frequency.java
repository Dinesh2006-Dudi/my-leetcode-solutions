class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int n = nums.length;

        // 1. Count frequency of each number
        for(int i = 0; i < n; i++)
        {
            if(freq.containsKey(nums[i]))
            {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
            else
            {
                freq.put(nums[i], 1);
            }
        }

        // 2. Copy numbers into Integer array
        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {

          
            if(freq.get(a) != freq.get(b))
            {
                return freq.get(a) - freq.get(b);
            }

           
            return b - a;
        });

        
        for(int i = 0; i < n; i++)
        {
            nums[i] = arr[i];
        }

        return nums;
    }
}