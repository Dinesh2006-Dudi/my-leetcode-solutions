class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int n=grid.length; // rows
        int m=grid[0].length; // cols

        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    sum+=4;

                if(i+1<n && grid[i+1][j]==1)
                {
                    sum-=2;
                }

                if(j+1<m && grid[i][j+1]==1)
                {
                    sum-=2;
                }
                }
               
            }
        }
        return sum;
    }
}