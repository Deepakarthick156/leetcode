class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==2){
                xor=xor^i;
            }
        }
        return xor;
    }
}