class Solution {
    public String addStrings(String num1, String num2) {
        
      char []a=num1.toCharArray();
      char []b=num2.toCharArray();

      StringBuilder res=new StringBuilder();
      int i=a.length-1;
      int j=b.length-1;
      int carry=0;

      while(i>=0 || j>=0 || carry>0)
      {
            int d1=(i>=0)?a[i]-'0':0;
            int d2=(j>=0)?b[j]-'0':0;

            int sum=d1+d2+carry;

            res.append(sum%10);
            carry=sum/10;

            i--;
            j--;
      }
    
      return res.reverse().toString();
    }

    
}