class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int bal=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
                bal++;
            }
            else{
                if(!st.isEmpty()&&bal>0&&st.peek()=='('){
                    st.pop();
                    bal--;
                }
                else{
                    if(bal==0){
                        st.push(ch);
                    }
                }
            }
        }
        return st.size();
    }
}