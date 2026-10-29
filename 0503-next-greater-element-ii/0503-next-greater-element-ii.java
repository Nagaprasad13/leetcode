class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=2*(nums.length);i>=0;i--){
            int idx=i%(nums.length);
            int val=nums[idx];
            while(!st.isEmpty()&&nums[st.peek()]<=val){
                st.pop();
            }
            if(st.isEmpty()){
                ans[idx]=-1;
            }
            else{
                if(idx<nums.length){
                    ans[idx]=nums[st.peek()];
                }
            }
            st.push(idx);
        }
        return ans;
    }
}