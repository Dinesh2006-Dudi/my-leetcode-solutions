class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int cnt=0;

        for(char c:jewels.toCharArray())
        {
            for(char i:stones.toCharArray())
            {
                if(c==i)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}