class Solution {
    public long countCommas(long n) {
        long res=0;
        long thre=1000;

        while(thre<=n)
        {
            res+=n-thre+1;
            thre *= 1000;
        }
        return res;
    }
}