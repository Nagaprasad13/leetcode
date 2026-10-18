class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        int[] left=new int[nums.length];
        left[0]=1;
        int[] right=new int[nums.length];
        right[right.length-1]=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>=nums[i]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
            }
        }
        for(int i=k;i<nums.length-k;i++){
            if(left[i-1]>=k&&right[i+1]>=k)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}