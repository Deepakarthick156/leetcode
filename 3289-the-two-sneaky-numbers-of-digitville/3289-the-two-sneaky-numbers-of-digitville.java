class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int arr[]=new int[2];
        int j=0;
        for(int i:map.keySet()){
            if(map.get(i)==2){
                arr[j++]=i;
            }
        }
        return arr;
    }
}