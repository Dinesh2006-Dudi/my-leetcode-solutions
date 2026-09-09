class Solution {
    public long countCommas(long n) {
        long res=0;
        long thre=1000;
        long temp=n;

        while(thre<=temp)
        {
            res+=temp-thre+1;
               if (thre > temp/ 1000) {
                break;
            }

            thre *= 1000;
        }
        return res;
    }
}