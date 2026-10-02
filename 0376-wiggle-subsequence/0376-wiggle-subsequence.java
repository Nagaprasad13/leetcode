class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int right=1,left=0,direction=0,k=0;
        while(right<nums.length){
            int sum=nums[right]-nums[left];
            if(direction==0){
                if(sum>0){
                    direction=1;
                    left=right;
                    right++;
                    k++;
                }
                else if(sum<0){
                    direction=-1;
                    left=right;
                    right++;
                    k++;
                }
                else{
                    right++;
                }
            }
            else if(direction==-1){
                if(sum<=0){
                    left=right;
                    right++;
                }
                else{
                    direction=1;
                    left=right;
                    right++;
                    k++;
                }
            }
            else{
                if(sum>=0){
                    left=right;
                    right++;
                }
                else{
                    direction=-1;
                    left=right;
                    right++;
                    k++;
                }
            }
        }
        return k+1;
    }
}