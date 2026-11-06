class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] qu) {
        Arrays.sort(logs,(a,b)->Integer.compare(a[1],b[1]));
        int[][] queries=new int[qu.length][2];
        for(int i=0;i<qu.length;i++){
            queries[i][0]=qu[i];
            queries[i][1]=i;//maintaining currtime
        }
        int[] servers=new int[n+1];
        Arrays.sort(queries,(a,b)->Integer.compare(a[0],b[0]));
        int[] ans=new int[queries.length];
        int activeserver=0,left=0,right=0;
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0]-x,end=queries[i][0];
            int currIdx=queries[i][1];
            while(right<logs.length&&logs[right][1]<=end){
                int server=logs[right][0];
                servers[server]++;
                if(servers[server]==1){
                    activeserver++;
                }
                right++;
            }
            while(left<logs.length&&logs[left][1]<st){//checking if the the query req is in give interval...
                int server=logs[left][0];
                servers[server]--;
                if(servers[server]==0){
                    activeserver--;
                }
                left++;
            }
            ans[currIdx]=n-activeserver;
        }
        
        return ans;
    }
}