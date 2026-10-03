class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] compare=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            compare[i]=nums[i];
        }
        Arrays.sort(nums);
        int l=-1,r=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=compare[i]){
                l=i;
                break;
            }
        }
        if(l==-1){
            return 0;
        }
        for(int i=l+1;i<nums.length;i++){
            if(nums[i]!=compare[i]){
                r=i;
            }
        }
        return r-l+1;
    }
}