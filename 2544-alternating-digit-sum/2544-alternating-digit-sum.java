class Solution {
    public int alternateDigitSum(int n) {
        
      
      int temp=n;  
      int digits_count=0;
      while(temp>0)
      {
        digits_count++;
        temp/=10;
      }

      int sum=0;

      int sign=(digits_count%2==0)? -1:1;

      while(n>0)
      {
        int digits=n%10;

        sum+=digits*sign;
        n/=10;
        sign=-sign;
      }
      return sum;


    }
}