class Solution {
    public int countDigits(int num) {
        
        int cnt=0;
        int temp=num;

        while(num>0)
        {
            int digits=num%10;

            if(temp%digits==0)
            {
                cnt++;
            }
            num/=10;
        }
        return cnt;
    }
}