class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                String str="";
                while(!st.isEmpty()&&st.peek()!='('){
                    str+=st.pop();
                }
                st.pop();
                for(char c:str.toCharArray()){
                    st.push(c);
                }
            }
            else{
                st.push(ch);
            }
        }
        String ans="";
        for(char ch:st){
            ans+=ch;
        }
        return ans;
    }
}