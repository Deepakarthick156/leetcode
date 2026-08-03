class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int currsum=0;
        int left=0;
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                currsum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            currsum+=nums[i];
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}