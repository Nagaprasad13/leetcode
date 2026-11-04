class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        Stack<Integer> st=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            int num=prices[i];
            if(st.isEmpty()){
                ans[i]=num;   
            }
            else{
                while(!st.isEmpty()&&st.peek()>num){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=num;
                }else{
                    int discount=st.peek();
                    ans[i]=num-discount;
                }
            }
            st.push(num);
        }
        return ans;
    }
}