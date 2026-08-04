class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        sub(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public static void sub(int nums[],int index,List<List<Integer>> ans,List<Integer> temp){
        
        ans.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            sub(nums,i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}