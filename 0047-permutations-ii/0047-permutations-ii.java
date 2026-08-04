class Solution {
    public static void backtrack(List<List<Integer>>l1,List<Integer>l2,int[] nums,boolean[] b){
        if(nums.length==l2.size()&&!l1.contains(l2)){
            l1.add(new ArrayList<>(l2));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(b[i])continue;
            b[i]=true;
            l2.add(nums[i]);
            backtrack(l1,l2,nums,b);
            l2.remove(l2.size()-1);
            b[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>l1=new ArrayList<>();
        boolean b[]=new boolean[nums.length];
        backtrack(l1,new ArrayList<>(),nums,b);
        return l1;
    }
}