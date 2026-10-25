class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int val=nums2[i];
            while(!st.isEmpty()&&st.peek()<=val){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(val,-1);
            }
            else{
                map.put(val,st.peek());
            }
            st.push(val);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}