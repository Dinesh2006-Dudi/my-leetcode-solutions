class Solution {
    public int longestPalindrome(String s) {
        

        HashSet<Character> seen=new HashSet<>();

        int maxlen=0;

        int n=s.length();

        for(char ch:s.toCharArray())
        {
            if(seen.contains(ch))
            {
                seen.remove(ch);
                maxlen+=2;
            }
            else{
                seen.add(ch);
            }
        }
        return seen.isEmpty()?maxlen:maxlen+1;
    }
}