class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxlen=0;
        int left=0;
        Map<Integer,Integer> basket=new HashMap<>();

        for(int right=0;right<n;right++)
        {
            if(basket.containsKey(fruits[right]))
            {
                basket.put(fruits[right],basket.get(fruits[right])+1);
            }
            else{
                basket.put(fruits[right],1);
            }

            while(basket.size()>2)
            {
                basket.put(fruits[left],basket.get(fruits[left])-1);
                if(basket.get(fruits[left])==0)
                {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;

    }
}