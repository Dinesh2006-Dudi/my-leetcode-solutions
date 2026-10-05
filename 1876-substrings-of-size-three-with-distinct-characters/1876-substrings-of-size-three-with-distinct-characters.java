class Solution {
    public int countGoodSubstrings(String s) {

        List<String> allstr=new ArrayList<>();
       int k=3;

       int n=s.length();
        int uni_cnt=0;

       for(int i=0;i<=n-k;i++)
       {
            String sub=s.substring(i,i+k);
            allstr.add(sub);

            if(sub.charAt(0)!=sub.charAt(1) && sub.charAt(1)!=sub.charAt(2)&&
            sub.charAt(0)!=sub.charAt(2))
            {
                uni_cnt++;
            }

       }
       return uni_cnt;
        
      
    }
}