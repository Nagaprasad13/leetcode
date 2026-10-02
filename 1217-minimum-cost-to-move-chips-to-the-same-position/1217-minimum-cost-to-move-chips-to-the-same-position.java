class Solution {
    public int minCostToMoveChips(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int odd=0,even=0;
        for(int num:nums){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}