class Solution {
    public int calculate(String s) {
        s+='+';//this is being added to make last value to be pushed into the stack
        char oper='+';
        int n=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
                continue;
            }
            if(oper=='+'){
                st.push(n);//these operation are done in next for loop
            }
            else if(oper=='-'){
                st.push(-n);//these operation are done in next for loop
            }
            else if(oper=='*'){
                st.push(st.pop()*n);
            }
            else if(oper=='/'){
                st.push(st.pop()/n);
            }
            oper=ch;
            n=0;
        }
        int res=0;
        for(int num:st){
            res+=num;
        }
        return res;
    }
}