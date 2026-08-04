class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer>l1=new ArrayList<>();
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
            l1.add(i);
        }
        List<Integer>l2=new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!l1.contains(i)){
                l2.add(i);
            }
        }
        return l2;
    }
}