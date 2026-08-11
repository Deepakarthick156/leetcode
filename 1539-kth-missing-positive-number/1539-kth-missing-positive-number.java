class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer>l1=new ArrayList<>();
        for(int i:arr){
            l1.add(i);
        }
        int count=0;
        int i=1;
        while(true){
            if(!l1.contains(i)){
                count++;
            }
            if(count==k)return i;
            i++;
        }
    }
}