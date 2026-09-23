class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> freq=new HashMap<>();

       int n=s.length();

       for(int i=0;i<n;i++)
       {
            char ch=s.charAt(i);
            if(freq.containsKey(ch))
            {
                freq.put(ch,freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
       }

       for(int i=0;i<n;i++)
       {
        char ch=s.charAt(i);
            if(freq.get(ch)==1)
            {
                return i;
            }
       }
       return -1;
    }
}