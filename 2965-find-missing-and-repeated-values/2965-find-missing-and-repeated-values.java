class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer>l1=new ArrayList<>();
        int repeat=0;
        for(int num[]:grid){
            for(int i:num){
                if(!l1.contains(i)){
                    l1.add(i);
                }
                else{
                    repeat=i;
                }
            }
        }
        int miss=0;
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!l1.contains(i)){
                miss=i;
                break;
            }
        }
        return new int[]{repeat,miss};
    }
}