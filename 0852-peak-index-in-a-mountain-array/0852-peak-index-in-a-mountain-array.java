class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<=right&&right<nums.length){
            int mid=left+(right-left)/2;
            int peak=nums[mid];
            if(mid>=1){
            if(peak>nums[mid-1]&&peak>nums[mid+1]){
                return mid;
            }
            else if(peak<nums[mid-1]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }}
            else{
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }
                else{
                    return mid+1;
                }
            }
        }
        return left;
    }
}