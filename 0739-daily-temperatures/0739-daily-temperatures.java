class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int[] nums=new int[temp.length];
        //HashMap<Integer,Integer> map=new HashMap<>(); this doesnot work because of duplicate values for changes indexes in hashmap
        
        for(int i=temp.length-1;i>=0;i--){
            int val=temp[i];
            if(st.isEmpty()){
                nums[i]=0;   
            }
            else{
                while(!st.isEmpty()&&temp[st.peek()]<=val){
                    st.pop();
                }
                if(st.isEmpty()){
                    nums[i]=0;
                }
                else{
                    int greaterValIndex=st.peek();
                    int diff=greaterValIndex-i;
                    nums[i]=diff;
                }
                
            }
            st.push(i);
        }
        return nums;
    }
}