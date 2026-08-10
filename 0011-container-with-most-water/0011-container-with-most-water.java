class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwtr=0;

        while(i<j)
        {
            int minht=Math.min(height[i],height[j]);
            int width=j-i;
            int area=minht*width;
            maxwtr=Math.max(maxwtr,area);


            if(height[i]<height[j])
            i++;
            else
            j--;
        }
        return maxwtr;

       
    }
}