class Solution {
    public int minOperations(int[] nums) {
        int steps=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i-1]>=nums[i]){
                nums[i]+=1;
                steps+=1;
            }
        }
        return steps;
    }
}