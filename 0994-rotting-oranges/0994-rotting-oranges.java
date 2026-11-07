class Solution {
    
    public int orangesRotting(int[][] nums) {
        Queue<Integer> rFrow=new ArrayDeque<>();
        Queue<Integer> mins=new ArrayDeque<>();
        Queue<Integer> rFcol=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==2){
                rFrow.add(i);
                rFcol.add(j);
                mins.add(0);
                }
            }
        }
        int maxmins=0;
        while(!rFrow.isEmpty()&&!rFcol.isEmpty()){
            int row=rFrow.poll();
            int col=rFcol.poll();
            int min=mins.poll();
            if(row>0&&nums[row-1][col]==1){
                nums[row-1][col]=2;
                rFrow.add(row-1);
                rFcol.add(col);
                mins.add(min+1);
            }
            if(row<nums.length-1&&nums[row+1][col]==1){
                nums[row+1][col]=2;
                rFrow.add(row+1);
                rFcol.add(col);
                mins.add(min+1);
            }
            if(col>0&&nums[row][col-1]==1){
                nums[row][col-1]=2;
                rFrow.add(row);
                rFcol.add(col-1);
                mins.add(min+1);
            }
            if(col<nums[0].length-1&&nums[row][col+1]==1){
                nums[row][col+1]=2;
                rFrow.add(row);
                rFcol.add(col+1);
                mins.add(min+1);
            }
            maxmins=Math.max(maxmins,min);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==1){
                    return -1;
                }
            }
        }
        return maxmins;
    }
   
}