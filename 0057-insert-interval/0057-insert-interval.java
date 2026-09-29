class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> lst=new ArrayList<>();
        int st=0,n=intervals.length;
        if(intervals.length==0){
            int[][] an=new int[1][2];
            an[0][0]=newInterval[0];
            an[0][1]=newInterval[1];
            return an;
        }
        while(st<n&&intervals[st][1]<newInterval[0]){
            lst.add(Arrays.asList(intervals[st][0],intervals[st][1]));
            st++;
        }
        while(st<n&&intervals[st][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[st][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[st][1],newInterval[1]);
            st++;
        }
        lst.add(Arrays.asList(newInterval[0],newInterval[1]));
        while(st<intervals.length){
            lst.add(Arrays.asList(intervals[st][0],intervals[st][1]));
            st++;
        }
        int[][] ans=new int[lst.size()][2];
        for(int i=0;i<lst.size();i++){
            ans[i][0]=lst.get(i).get(0);
            ans[i][1]=lst.get(i).get(1);
        }
        return ans;
    }
}