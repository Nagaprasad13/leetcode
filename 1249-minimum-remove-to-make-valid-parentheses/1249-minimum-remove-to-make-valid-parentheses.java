class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        boolean[] bol=new boolean[100000];
        int bal=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
                bal++;
            }
            else if(ch==')'){
                if(!st.isEmpty()&&bal>0){
                    st.pop();
                    bal--;
                }
                else{
                    if(bal==0){
                        st.push(i);
                    }
                }
            }
        }
        //boolean[] bol=new boolean[100000];
        while(!st.isEmpty()){
            bol[st.pop()]=true;
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(bol[i]==false){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}