class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();

        if(s.length()<p.length())
        return res;

        int f1[]= new int[26];
        int f2[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            f1[p.charAt(i) -'a']++;
            f2[s.charAt(i) - 'a']++;
        }

        if(same(f1,f2)) res.add(0);


        for(int right=p.length();right<s.length();right++)
        {
            int left=right-p.length();
            f2[s.charAt(right) - 'a']++;
            f2[s.charAt(left) - 'a']--;

            if(same(f1,f2)) res.add(left+1);

        }
        return res;
    }
    boolean same(int []a ,int []b)
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }

}