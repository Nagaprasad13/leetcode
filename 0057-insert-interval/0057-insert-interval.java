class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> lst=new ArrayList<>();
        int i=0;
        int st=newInterval[0],end=newInterval[1];
        while(i<intervals.length&&intervals[i][1]<st){
            lst.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
        }
        while(i<intervals.length&&intervals[i][0]<=end){
            st=Math.min(st,intervals[i][0]);
            end=Math.max(end,intervals[i][1]);
            i++;
        }
        lst.add(Arrays.asList(st,end));
        while(i<intervals.length){
            lst.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
        }
        int[][] ans=new int[lst.size()][2];
        for(int d=0;d<lst.size();d++){
            ans[d][0]=lst.get(d).get(0);
            ans[d][1]=lst.get(d).get(1);
        }
        return ans;
    }
}