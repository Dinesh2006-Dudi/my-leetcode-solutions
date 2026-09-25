class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;

        HashMap<Integer,Integer> freq=new HashMap<>();

        HashSet<Integer> seen=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(freq.containsKey(arr[i]))
            {
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else{
                freq.put(arr[i],1);
            }
        }

        for(int key:freq.keySet())
        {
            int cnt=freq.get(key);
            if(seen.contains(cnt))
            {
                return false;
            }
            seen.add(cnt);
        }
        return true;
    }
}