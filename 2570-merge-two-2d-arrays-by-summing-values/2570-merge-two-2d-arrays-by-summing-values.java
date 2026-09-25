class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int p1=0,p2=0;
        List<List<Integer>> lst=new ArrayList<>();
        while(p1<nums1.length&&p2<nums2.length){
            if(nums1[p1][0]==nums2[p2][0]){
                lst.add(Arrays.asList(nums1[p1][0],nums1[p1][1]+nums2[p2][1]));
                p1++;
                p2++;
            }
            else if (nums1[p1][0]<nums2[p2][0]){
                lst.add(Arrays.asList(nums1[p1][0],nums1[p1][1]));
                p1++;
            }
            else{
                lst.add(Arrays.asList(nums2[p2][0],nums2[p2][1]));
                p2++;
            }
        }
        while(p1<nums1.length){
            lst.add(Arrays.asList(nums1[p1][0],nums1[p1][1]));
            p1++;
        }
        while(p2<nums2.length){
            lst.add(Arrays.asList(nums2[p2][0],nums2[p2][1]));
            p2++;
        }
        int[][] ans=new int[lst.size()][2];
        for(int i=0;i<lst.size();i++){
            ans[i][0]=lst.get(i).get(0);
            ans[i][1]=lst.get(i).get(1);
        }
        return ans;
    }
}