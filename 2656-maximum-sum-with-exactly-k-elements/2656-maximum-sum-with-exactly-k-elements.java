class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<k;i++){
            sum+=max;
            max+=1;
        }
        return sum;
    }
}