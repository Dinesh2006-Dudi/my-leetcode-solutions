class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        Set<Character> seen= new HashSet<>();
        int maxlen=0;

        for(int right=0;right<n;right++)
        {
            while(seen.contains(s.charAt(right)))
            {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;


    }
}