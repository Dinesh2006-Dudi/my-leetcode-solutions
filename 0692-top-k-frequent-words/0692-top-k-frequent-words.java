class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        int n=words.length;

       TreeMap<String,Integer> freq=new TreeMap<>();

       for(int i=0;i<n;i++)
       {
            String word=words[i];

            if(freq.containsKey(word))
            {
                freq.put(word,freq.get(word)+1);
            }
            else{
                freq.put(word,1);
            }
       }
       
       ArrayList<String> list=new ArrayList<>(freq.keySet());

       Collections.sort(list ,(a,b)->{

            if(freq.get(a)!=freq.get(b))
            {
                return freq.get(b)-freq.get(a);
            }
            return a.compareTo(b);
            });
       return list.subList(0,k);
    }
}