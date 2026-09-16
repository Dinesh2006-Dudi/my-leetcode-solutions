class Solution {
    public String reverseVowels(String s) {

        String vls="";

        char []a=s.toCharArray();

        for(int i=0;i<a.length;i++)
        {
            char c=a[i];

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
             || c=='A' || c=='E' || c=='I'  || c=='O'  ||c=='U' )
             {
                vls+=c;
             }
        }

        int k=vls.length()-1;

        for(int i=0;i<a.length;i++)
        {
            char c=a[i];
              if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
             || c=='A' || c=='E' || c=='I'  || c=='O'  ||c=='U' )
             {

             a[i]=vls.charAt(k);
             k--;
             }
        }
        return new String(a);
    }
}