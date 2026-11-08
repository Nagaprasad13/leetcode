class Solution {
    public int largestRectangleArea(int[] nums) {
        int[] NSL=new int[nums.length];
        int[] NGR=new int[nums.length];
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!st1.isEmpty()&&nums[st1.peek()]>=nums[i]){
                st1.pop();
            }
            NSL[i]=st1.isEmpty()?-1:st1.peek();
            st1.push(i);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!st2.isEmpty()&&nums[st2.peek()]>=nums[i]){
                st2.pop();
            }
            NGR[i]=st2.isEmpty()?nums.length:st2.peek();
            st2.push(i);
        }
        int maxArea=0;
        for(int i=0;i<nums.length;i++){
            int width=NGR[i]-NSL[i]-1;
            maxArea=Math.max(nums[i]*width,maxArea);
        }
        return maxArea;
    }
}