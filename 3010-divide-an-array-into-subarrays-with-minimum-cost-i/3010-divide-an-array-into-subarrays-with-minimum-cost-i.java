class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        int fm=Integer.MAX_VALUE;
        int sm=Integer.MAX_VALUE;
        for(int j=1;j<nums.length;j++){
            int i=nums[j];
            if(i<fm){
                sm=fm;
                fm=i;
            }
            else if(i<=sm)sm=i;
        }
        return sum+fm+sm;
    }
}