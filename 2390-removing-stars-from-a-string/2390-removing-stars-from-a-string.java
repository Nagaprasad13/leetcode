class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                st.pop();
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