class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                swap(nums,i,k);
                k++;
            }
            
        }
        return nums;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}