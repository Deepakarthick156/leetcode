class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer>l1=new ArrayList<>();
        for(int i:nums){
            if(Collections.frequency(l1,i)<k){
                l1.add(i);
            }
        }
        int arr[]=new int[l1.size()];
        int ind=0;
        for(int i:l1){
            arr[ind++]=i;
        }
        return arr;
    }
}