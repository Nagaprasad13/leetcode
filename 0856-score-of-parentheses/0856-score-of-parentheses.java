class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> score =new Stack<>();
        int val=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                score.push(val);
                val=0;//reseting the val to zero to make the score 0 at starting 
            }
            else{
                val=score.pop()+Math.max(2*val,1);//using this we can find the prev val, if score is xero then there is only one parenthese if passing val (()) changes the val, first ) makes val=1, then second ) changes to 2 if another parenthese like (())(), 2 then 2 is pushed into the stack and current score os added
            }
        }
        return val;
    }
}