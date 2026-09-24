class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int mul=1,left=0;
        if(k<=1){
            return 0;
        }
        for(int right=0;right<nums.length;right++){
            mul*=nums[right];
            while(mul>=k){
                mul/=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;

    }
}