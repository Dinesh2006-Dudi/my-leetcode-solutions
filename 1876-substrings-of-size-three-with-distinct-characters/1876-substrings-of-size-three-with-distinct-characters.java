class Solution {
    public int countGoodSubstrings(String s) {

        List<String> allstr=new ArrayList<>(); 
        int k=3;
        int unique_cnt=0;

        if(s.length()<k)
        return 0;

        for(int i=0;i<=s.length()-k;i++)
        {
            String sub=s.substring(i,i+k);
            allstr.add(sub);


            if(sub.charAt(0)!=sub.charAt(1) && sub.charAt(1)!=sub.charAt(2)
              && sub.charAt(0)!=sub.charAt(2))
        {

              unique_cnt++;
        }
    }

    return unique_cnt;

        
      
    }
}