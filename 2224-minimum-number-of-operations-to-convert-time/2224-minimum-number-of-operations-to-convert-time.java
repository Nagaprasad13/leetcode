class Solution {
    public int convertTime(String cur, String cor) {
        char[] curr=cur.toCharArray();
        char[] corr=cor.toCharArray();
        int wrong=(int)curr[0]*600+(int)curr[1]*60+((int)curr[3]*10+(int)curr[4]);
        int correct=(int)corr[0]*600+(int)corr[1]*60+((int)corr[3]*10+(int)corr[4]);
        int diff=Math.abs(wrong-correct);
        int steps=0;
        while(diff>=60){
            diff=diff-60;
            steps+=1;
        }
        while(diff>=15){
            diff=diff-15;
            steps+=1;
        }
        while(diff>=5){
            diff=diff-5;
            steps+=1;
        }
        while(diff>=1){
            diff=diff-1;
            steps+=1;
        }
        return steps;
    }
}