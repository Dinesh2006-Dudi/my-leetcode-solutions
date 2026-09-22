class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n=candies.length;

        int maxcdy=0;

        for(int i=0;i<n;i++)
        {
            maxcdy=Math.max(maxcdy,candies[i]);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(candies[i]+extraCandies>=maxcdy)
            {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
            
        }

        return ans;
    }
}