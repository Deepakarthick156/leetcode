class Solution {
    public List<Integer> findPeaks(int[] nums) {
        List<Integer>l1=new ArrayList<>();
        for(int i=1;i<nums.length-1;i++){
            int curr=nums[i];
            int prev=nums[i-1];
            int next=nums[i+1];
            if(curr>next&&curr>prev){
                l1.add(i);
            }
        }
        return l1;
    }
}