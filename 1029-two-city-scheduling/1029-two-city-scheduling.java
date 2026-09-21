class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->Integer.compare((b[1]-b[0]),(a[1]-a[0])));
        int ans=0;
        int n=costs.length/2;
        for(int i=0;i<n;i++){
            ans+=costs[i][0];
            ans+=costs[n+i][1];
        }
        return ans;
    }
}