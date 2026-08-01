class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        for(int i:nums){
            avg=i+avg;
        }
        avg=(int)avg/nums.length;
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int ele = Math.max(1, avg + 1);
        while(s.contains(ele)){
            ele++;
        }
        return ele;
    }
}