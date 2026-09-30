class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> lst=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        while(i<intervals.length){
            int st=intervals[i][0];
            int end=intervals[i][1];
            while(i<intervals.length-1&&end>=intervals[i+1][0]){
                i++;
                end=Math.max(intervals[i][1],end);
            }
            lst.add(Arrays.asList(st,end));
            i++;
        }
        int[][] ans=new int[lst.size()][2];
        for(int is=0;is<lst.size();is++){
            ans[is][0]=lst.get(is).get(0);
            ans[is][1]=lst.get(is).get(1);
        }
        return ans;
    }
}