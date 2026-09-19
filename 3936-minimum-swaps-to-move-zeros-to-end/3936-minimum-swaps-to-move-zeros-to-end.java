class Solution {
    public int minimumSwaps(int[] nums) {
        int left=0,right=nums.length-1;
        int count=0;
        while(left<right){
            while(left<right&&nums[left]!=0){
                left++;
            }
            while(left<right&&nums[right]==0){
                right--;
            }
            if(nums[left]==0&&nums[right]!=0){
                swap(nums,left,right);
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
      public static void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}