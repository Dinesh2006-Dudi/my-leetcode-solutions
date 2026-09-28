class Solution {
    public int maxDepth(String s) {
        
        int depth=0;
        int r=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='(')
            {
                depth++;
                r=Math.max(r,depth);
            }
            else if(c==')')
            {
                depth--;
            }
        }
        return r;
    }
}