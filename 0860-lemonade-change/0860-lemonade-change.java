class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] res=new int[2];
        for(int i=0;i<2;i++){
            res[i]=0;
        }
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                res[0]++;
            }
            else if(bills[i]==10){
                res[0]--;
                res[1]++; 
            }
            else{
                if(res[1]>=1&&res[0]>=1){
                    res[1]--;
                    res[0]--;
                }
                else if(res[0]>=3){
                    res[0]-=3;
                } 
                else{
                    return false;
                }
            }
            if(res[0]<0){
                return false;
            }
            if(res[1]<0){
                return false;
            }
        }
        return true;
    }
}