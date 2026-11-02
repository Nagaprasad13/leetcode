class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int direc=asteroids[i];
            if(direc<0){
                while(!st.isEmpty()&&st.peek()>0&&st.peek()<-direc){
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0){
                    st.push(direc);
                }
                if(st.peek()==-direc){
                    st.pop();
                }
            }
            else{
                st.push(direc);
            }

    }
    int[] res=new int[st.size()];
    int i=res.length-1;
    while(!st.isEmpty()){
        res[i--]=st.pop();
    }
    return res;
}
}