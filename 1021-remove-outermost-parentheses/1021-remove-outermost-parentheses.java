class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder res = new StringBuilder();
        int brackets= 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (brackets > 0) res.append(c);
                brackets++;
            } else {
                brackets--;
                if (brackets> 0) res.append(c);
            }
        }
        return res.toString();
    }
}