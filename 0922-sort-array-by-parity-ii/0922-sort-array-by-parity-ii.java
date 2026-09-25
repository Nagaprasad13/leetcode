class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int p1=0,p2=1;
        while(p1<nums.length&&p2<nums.length){
            if(nums[p1]%2==0){
                p1+=2;
            }
            else if(nums[p2]%2!=0) {
                p2+=2;
            }
            else{
                swap(nums,p1,p2);   
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