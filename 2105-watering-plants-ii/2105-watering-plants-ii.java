class Solution {
    public int minimumRefill(int[] nums, int capacityA, int capacityB) {
        int left=0,right=nums.length-1;
        int pump1=capacityA,pump2=capacityB,refil=0;
        while(left<=right){
            if(left==right){
                if(capacityA>capacityB){
                    if(capacityA<nums[left]){
                        refil+=1;
                        capacityA=pump1;
                    }
                    capacityA-=nums[left];
                }
                else{
                    if(capacityB<nums[left]){
                        refil+=1;
                        capacityB=pump2;
                    }
                    capacityB-=nums[left];
                }
                break;
            }
            if(capacityA<nums[left]){
                refil+=1;
                capacityA=pump1;
            }
            capacityA-=nums[left];
            if(capacityB<nums[right]){
                refil+=1;
                capacityB=pump2;
            }
            capacityB-=nums[right];
            left++;
            right--;
        }
        return refil;
    }
}