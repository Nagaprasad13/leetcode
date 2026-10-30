class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] car=new int[position.length][2];
        for(int i=0;i<position.length;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a,b)->Integer.compare(a[0],b[0]));
        Stack<Double> st=new Stack<>();
        for(int i=0;i<car.length;i++){
            int pos=car[i][0];
            int spd=car[i][1];
            double time=(double)(target-pos)/spd;
            while(!st.isEmpty()&&st.peek()<=time){
                st.pop();
            }
            st.push(time);
        }
        return st.size();
    }
}