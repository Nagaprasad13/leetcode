class Solution {
    public String longestPalindrome(String s) {
        int i=0,l=0,r=0,n=s.length();
        int st=0;
        int maxlen=1;
        while(i<n){
            l=i;r=i;
            while(l>=0&&r<n&&(s.charAt(l)==s.charAt(r))){
                if(r-l+1>maxlen){
                    maxlen=r-l+1;
                    st=l;
                }
                l--;
                r++;
            }
            l=i;r=i+1;
            while(l>=0&&r<n&&(s.charAt(l)==s.charAt(r))){
                if(r-l+1>maxlen){
                    maxlen=r-l+1;
                    st=l;
                }
                l--;
                r++;
            }
            i++;
        }
        return s.substring(st,st+maxlen);
    }
}