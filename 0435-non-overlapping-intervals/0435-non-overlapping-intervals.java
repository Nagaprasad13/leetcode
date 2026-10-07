class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        int cnt=0;
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        int st=nums[0][0];
        int end=nums[0][1];
        int i=1;
        while(i<nums.length){
            if(nums[i][0]<end){
                cnt++;
                end=Math.min(end,nums[i][1]);
            }
            else{
                end=nums[i][1];
            }
            i++;
        }
        System.out.println(Arrays.deepToString(nums));
        return cnt;
    }
}