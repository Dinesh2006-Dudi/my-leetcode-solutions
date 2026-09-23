class Solution {
    public String frequencySort(String s) {
        
        int n=s.length();

        HashMap<Character,Integer> freq=new HashMap<>();

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

        String res="";

        for(int cnt=n;cnt>=0;cnt--)
        {
            for(char ch:freq.keySet())
            {
                if(freq.get(ch)==cnt)
                {
                    for(int i=0;i<cnt;i++)
                    {
                        res+=ch;
                    }
                }
            }
        }
        return res;
    }
}