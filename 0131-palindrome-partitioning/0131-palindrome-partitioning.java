class Solution {
    List<List<String>>ans =new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(new ArrayList<>(),0,s);
       // System.out.println(s.substring(0,2));
        return ans;
    }
    void helper(List<String> path,int st,String s){
        if(st==s.length()){
            ans.add(new ArrayList<>(path));
            return ;
        }
        for(int i=st;i<s.length();i++){
            if(ispalindrome(st,i,s)){
                path.add(s.substring(st,i+1));
                helper(path,i+1,s);
                path.remove(path.size()-1);
            }
        }
    }
    boolean ispalindrome(int left,int right,String s){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}