class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return ans;
        }
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        helper(digits,0,new StringBuilder(),ans,map);
        return ans;
    }
    public static void helper(String digits,int st,StringBuilder combination_path,List<String> ans,Map<Character,String> map){
        if(st==digits.length()){
            ans.add(combination_path.toString());
            return ;
        }
        String letter_combination_path=map.get(digits.charAt(st));
        for(char ch:letter_combination_path.toCharArray()){
            combination_path.append(ch);
            helper(digits,st+1,combination_path,ans,map);
            combination_path.deleteCharAt(combination_path.length()-1);//for abandoning thr path because of last idx
        }
    }
}