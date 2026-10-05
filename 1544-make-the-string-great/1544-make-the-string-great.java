class Solution {
    public String makeGood(String s) {
        
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(res.length()>0)
            {
                   char last=res.charAt(res.length()-1);
            if(Character.toLowerCase(last)==Character.toLowerCase(ch)
                &&  Character.isLowerCase(last)!=Character.isLowerCase(ch))
                {
                    res.deleteCharAt(res.length()-1);
                }
                else{
                    res.append(ch);
                }
            }
                else{
                    res.append(ch);
                }
            
        }
        return res.toString();
    }
}