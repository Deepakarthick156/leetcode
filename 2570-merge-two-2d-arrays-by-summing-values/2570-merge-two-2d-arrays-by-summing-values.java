class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer>map=new TreeMap<>();
        for(int arr[]:nums1){
            map.put(arr[0],arr[1]);
        }
        for(int arr[]:nums2){
            if(map.containsKey(arr[0])){
                map.put(arr[0],map.get(arr[0])+arr[1]);
            }
            else{
                map.put(arr[0],arr[1]);
            }
        }
        int size=map.size();
        int res[][]=new int[size][2];
        int ind=0;
        for(int i:map.keySet()){
            int key=i;
            int val=map.get(i);
            res[ind][0]=key;
            res[ind++][1]=val;
        }
        return res;
    }
}