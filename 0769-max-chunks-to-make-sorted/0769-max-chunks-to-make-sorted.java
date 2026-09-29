class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        if(n==1)
        return n;
        int chunkcnt=0;
        int maxchunks=arr[0];
        for(int i=0;i<n;i++)
        {
            maxchunks=arr[i]>maxchunks?arr[i]:maxchunks;
            if(maxchunks==i)
            {
                chunkcnt++;
            }
        }
        return chunkcnt;
    }
}