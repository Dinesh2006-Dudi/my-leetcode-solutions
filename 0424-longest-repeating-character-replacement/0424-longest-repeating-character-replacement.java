class Solution {
    public int characterReplacement(String s, int k) {
        
        int left=0;
        int maxcnt=0;
        int maxlen=0;
        int freq[] =new int[26];

        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            freq[c-'A']++;

            maxcnt=Math.max(maxcnt,freq[c - 'A']);

            while((right-left+1)-maxcnt>k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}