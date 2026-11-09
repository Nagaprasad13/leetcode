class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        helper(nums,path,0,ans);
        return ans;
    }
    public static void helper(int[] nums,List<Integer> path,int st,
        List<List<Integer>> ans){
        ans.add(new ArrayList<>(path));//adding a copy (because of local variables)
        for(int i=st;i<nums.length;i++){
            if(i>st&&nums[i-1]==nums[i]){
                continue;
            }//check for duplicates and skip them
            path.add(nums[i]);
            helper(nums,path,i+1,ans);
            path.remove(path.size()-1);
        }
    }
}