class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0;
       int n=s.length();
        int maxlen=0;
       Set<Character> res=new HashSet<>();

       for(int right=0;right<n;right++)
       {
            while(res.contains(s.charAt(right)))
            {
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);

       }
       return maxlen;


    }
}