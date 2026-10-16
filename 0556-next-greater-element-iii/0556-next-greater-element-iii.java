class Solution {
    public int nextGreaterElement(int n) {
        char[] num=String.valueOf(n).toCharArray();
        int i=num.length-2;
        while(i>=0&&num[i]>=num[i+1]){
            i--;
        }//finding the index where the inc of digits occur
        if(i<0){
            return -1;
        }
        int j=num.length-1;
        while(num[j]<=num[i]){
            j--;
        }
        swap(num,i,j);
        int left=i+1;//reversing to starting point of the greater element
        int right=num.length-1;
        while(left<right){
            swap(num,left,right);
            left++;
            right--;
        }
        String str=new String(num);
        long val=Long.parseLong(str);
        if(val>Integer.MAX_VALUE){
            return -1;
        }
        return (int) val;
    }
    public static void swap(char[] num,int i,int j){
        char temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}