class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long newmass=mass;
        Stack<Integer> st=new Stack<>();
        for(int num:asteroids){
            if(num<=newmass){
                newmass+=num;
            }
            else{
                st.push(num);
                break;
            }
        }
        return st.isEmpty();
    }
}