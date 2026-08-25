class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i:nums){
            if(i%2==0)
              map.put(i,map.getOrDefault(i,0)+1);
        }
        int freq=-1;
        int ele=-1;
        for(int i:map.keySet()){
            if(map.get(i)>freq){
                freq=map.get(i);
                ele=i;
            }
        }
        return ele;
    }
}