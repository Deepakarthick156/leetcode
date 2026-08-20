class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int res[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            int maxlen=-1;
            for(int j=0;j<grid.length;j++){
                String res1=grid[j][i]+"";
                maxlen=Math.max(res1.length(),maxlen);
            }
            res[i]=maxlen;
        }
        return res;
    }
}