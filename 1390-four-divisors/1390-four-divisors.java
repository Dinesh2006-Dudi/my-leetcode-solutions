class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int n=nums.length;

       int msum=0;

       for(int i=0;i<n;i++)
       {    
            int sum=0;
            int cnt=0;
            int num=nums[i];

            for(int j=1;j*j<=num;j++)
            {
                if(num%j==0)
                {
                    int quo=num/j;

                    if(j==quo)
                    {
                        cnt++;
                        sum+=j;
                    }
                    else{
                        cnt+=2;
                        sum+=j+quo;
                    }
                }
            }

            if(cnt==4)
            {
                msum+=sum;
            }

       }

       return msum;
    }
}