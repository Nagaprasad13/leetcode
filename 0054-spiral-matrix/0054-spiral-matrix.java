class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst=new ArrayList<>();//(0,0) (0,1) (0,2) (1,2) (2,2) (2,1) (2,0) (1,0) (1,1)
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                lst.add(matrix[left][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                lst.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    lst.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    lst.add(matrix[i][left]);
                }
                left++;
            }
        }
        return lst;

    }
}