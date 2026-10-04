class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int st=0,curr=0,gasSum=0,costSum=0;
        for(int i=0;i<gas.length;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(gasSum<costSum){
            return -1;
        }
        for(int i=0;i<gas.length;i++){   
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                st=i+1;
            }
        }
        return st;   
    }
}