class Solution {
    public String decodeString(String s) {
        Stack<Character> substr=new Stack<>();
        Stack<Integer> times=new Stack<>();
        
        int n=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                times.push(n);
                substr.push(ch);
                n=0;
            }
            else if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }
            else if(ch==']'){
                StringBuilder sub=new StringBuilder();
                while(!substr.isEmpty()&&substr.peek()!='['){
                    sub.append(substr.pop());
                }
                substr.pop();
                sub.reverse();
                int mul=1;
                if(!times.isEmpty()){
                    mul=times.pop();
                }
                String ans_decoded="";
                for(int ih=0;ih<mul;ih++){
                    ans_decoded+=sub;
                }
                for(char g:ans_decoded.toCharArray()){
                    substr.push(g);
                }
            }
            else{
                substr.push(ch);
            }   

        }
        String ans="";
        for(char f:substr){
            ans+=f;
        }
        return ans;

    }
}