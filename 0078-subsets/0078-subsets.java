class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        helper(nums,path,0,ans);
        return ans;
    }
    public static void helper(int[] nums,List<Integer> path,int st,List<List<Integer>> ans){
        ans.add(new ArrayList<>(path));//adding a copy (because of local variables)
        for(int i=st;i<nums.length;i++){
            path.add(nums[i]);
            helper(nums,path,i+1,ans);
            path.remove(path.size()-1);
        }
    }
}