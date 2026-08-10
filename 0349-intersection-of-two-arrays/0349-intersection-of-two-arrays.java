class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();

        for(int i:nums1)
        {
            s1.add(i);
        }

        Set<Integer> s2=new HashSet<>();        
        for(int i:nums2)
        {
            s2.add(i);
        }

        Set<Integer> main=new HashSet<>();

        for(Integer val:s1)
        {
            if(s2.contains(val))
            {
                main.add(val);
            }
        }

        int [] arr=new int[main.size()];
        int j=0;
        for(Integer val:main)
        {
            arr[j]=val.intValue();
            j++;
        }
        return arr;

    }
}