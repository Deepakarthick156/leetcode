class Solution {
    public int countHillValley(int[] nums) {
        List<Integer>l1=new ArrayList<>();
        l1.add(nums[0]);
        for(int i:nums){
            if(l1.size()>0){
                if(l1.get(l1.size()-1)!=i)
                   l1.add(i);
            }
        }
        int count=0;
        for(int i=1;i<=l1.size()-2;i++){
            int prev=l1.get(i-1);
            int curr=l1.get(i);
            int next=l1.get(i+1);
            if((curr>prev&&curr>next)||(curr<prev&&curr<next)){
                count++;
            }
        }
        return count;
    }
}