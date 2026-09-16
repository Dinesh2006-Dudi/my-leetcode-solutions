class Solution {
    public int longestPalindrome(String s) {
        

        HashSet<Character> seen=new HashSet<>();
        int len=0;
        for(char ch:s.toCharArray())
        {
            if(seen.contains(ch))
            {
                seen.remove(ch);
                len+=2;
            }
            else{
                seen.add(ch);
            }
        }
        return seen.isEmpty()?len:len+1;
    }
}