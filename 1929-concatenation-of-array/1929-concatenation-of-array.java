class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int n=nums.length;
        for(int i=0;i<n*2;i++){
            int idx=i%n;
            ans[i]=nums[idx];
        }
        return ans;
    }
}