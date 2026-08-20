class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int row[]:grid){
            Arrays.sort(row);
        }
        int ans=0;
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                max=Math.max(max,grid[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}