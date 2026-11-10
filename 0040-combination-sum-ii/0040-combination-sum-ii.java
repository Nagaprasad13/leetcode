class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<Integer> combi=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,target,combi);

        return ans;
    }
    void solve(int[] nums,int idx,int target,List<Integer> combi){
        if(target==0){
            ans.add(new ArrayList<>(combi));
            return ;
        }
        if(target<0){
            return ;
        }
        if(idx==nums.length){
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            if(i>idx&&nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            combi.add(nums[i]);
            solve(nums,i+1,target-nums[i],combi);
            combi.remove(combi.size()-1);
        }
    }
}