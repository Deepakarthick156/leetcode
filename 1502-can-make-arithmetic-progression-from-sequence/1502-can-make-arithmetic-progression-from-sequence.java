class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==2)return true;
        Arrays.sort(arr);
        int prev=arr[1]-arr[0];
        int curr=0;
        for(int i=2;i<arr.length;i++){
            curr=arr[i]-arr[i-1];
            if(curr!=prev){
                return false;
            }
        }
        return true;
    }
}