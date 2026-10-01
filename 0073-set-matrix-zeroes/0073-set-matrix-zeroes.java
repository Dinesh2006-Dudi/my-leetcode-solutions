class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length; // row
        int n=matrix[0].length; // col

        boolean[] zerorow=new boolean[m];
        boolean[] zerocol=new boolean[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    zerorow[i]=true;
                    zerocol[j]=true;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(zerorow[i]==true || zerocol[j]==true)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}