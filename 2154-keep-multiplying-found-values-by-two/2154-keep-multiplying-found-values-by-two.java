class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer>l1=new ArrayList<>();
        for(int i:nums){
            l1.add(i);
        }
        while(l1.contains(original)){
            original=original*2;
        }
        return original;
    }
}