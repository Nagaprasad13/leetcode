class Solution {
    public int maxDepth(String s) {
        int max=0,score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                score++;
                max=Math.max(score,max);
            }
            else if(s.charAt(i)==')'){
                score--;
            }
        }
        return max;
    }
}