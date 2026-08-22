class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;
        int [] f1 = new int[26];
        int [] f2= new int[26];

        for(int i=0;i<s1.length();i++)
        {
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }


            if(same(f1,f2))
            return true;

            int left=0;

            for(int right=s1.length();right<s2.length();right++)
            {
                f2[s2.charAt(right) - 'a']++;
                f2[s2.charAt(left) - 'a']--;
                left++;

                if(same(f1,f2)) return true;
            }
                return false;
            }
        boolean same(int[] a,int[] b)
        {
            for(int i=0;i<26;i++)
            {
                if(a[i]!=b[i])
                return false;
            }

                return true;
        }
}