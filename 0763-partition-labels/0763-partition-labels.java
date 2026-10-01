class Solution {
    public List<Integer> partitionLabels(String s) {
        //int[] first=new int[26];
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // if(last[ch-'a']==-1){
            //     first[ch-'a']=i;
            // }
            last[ch-'a']=i;
        }
        List<Integer> lst=new ArrayList<>();
        int st=0,end=0;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            end=Math.max(end,last[idx]);
            if(i==end){
                lst.add(end-st+1);
                st=i+1;
            }
        }
        return lst;
    }
    
}