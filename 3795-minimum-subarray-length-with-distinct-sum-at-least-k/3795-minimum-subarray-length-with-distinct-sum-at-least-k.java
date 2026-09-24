class Solution {
    public int minLength(int[] nums, int k) {
        int left=0,maxLen=Integer.MAX_VALUE,sum=nums[0];
        if(sum>=k){
            maxLen=Math.min(maxLen,0-left+1);
        }
        for(int num:nums){
            if(num>=k){
                return 1;
            }
        }
        for(int right=1;right<nums.length;right++){
            if(right<nums.length-1&&nums[right]==nums[right+1]){
                sum-=nums[left];
                left++;
                continue;
            }
            sum+=nums[right];
            while(left<=right&&sum>=k){
                maxLen=Math.min(maxLen,right-left+1); 
                sum-=nums[left];
                left++;   
            }
        }
        return maxLen==Integer.MAX_VALUE?-1:maxLen;
    }
}