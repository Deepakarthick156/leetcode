class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer>map=new TreeMap<>();
        for(int arr[]:nums){
            for(int i:arr){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        List<Integer>l1=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==nums.length){
                l1.add(i);
            }
        }
        return l1;
    }
}