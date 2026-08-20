class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int res[]=new int[nums.length];
        while(!Arrays.equals(res,nums)){
            int min=Integer.MAX_VALUE;
            for(int i:nums){
                if(i!=0)
                  min=Math.min(i,min);
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i]=nums[i]-min;
                }
            }
            count++;
        }
        return count;
    }
}