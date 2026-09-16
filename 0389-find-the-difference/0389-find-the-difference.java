class Solution {
    public char findTheDifference(String s, String t) {
       
      int s1=0,s2=0;

      for(char c:s.toCharArray())
      {
        s1+=c;
      }
      for(char c:t.toCharArray())
      {
        s2+=c;
      }

      char res=(char) (s2-s1);
      return res;



    }
}