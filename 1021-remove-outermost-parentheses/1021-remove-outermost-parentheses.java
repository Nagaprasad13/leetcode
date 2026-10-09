class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder(s.length());
        int idx=-1;
        for(char c:s.toCharArray()){  
            if(c=='('){
                idx++;
                if(idx>=1){
                    sb.append(c);
                }
                continue;
            }
            idx--;
            if(idx>-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}