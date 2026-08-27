class Solution {
    public int numberOfSubstrings(String s) {
        int [] charcnt=new int[3];

        int left=0;

        int cnt=0;

        for(int right=0;right<s.length();right++)
        {
            charcnt[s.charAt(right) - 'a']++;

            while(charcnt[0]>0 && charcnt[1]>0 && charcnt[2]>0)
            {
                cnt+=s.length()-right;
                charcnt[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return cnt;
    }
}