class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> res=new ArrayList<>();
         if (s == null || p == null || s.length() < p.length()) {
            return res; 
        }
        
        int a=s.length();
        int b=p.length();

        int pfreq[]=new int[26];
        int widfreq[]=new int[26];

        for(int i=0;i<b;i++)
        {
            pfreq[p.charAt(i)-'a']++;
        }

        for(int i=0;i<b;i++)
        {
            widfreq[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(pfreq,widfreq))
        {
                res.add(0);
        }

            for(int i=b;i<a;i++)
            {
                widfreq[s.charAt(i)-'a']++;

                widfreq[s.charAt(i-b)-'a']--;

            if(Arrays.equals(pfreq,widfreq))
            {
                res.add(i-b+1);
            }
            }
            return res;
    }

}