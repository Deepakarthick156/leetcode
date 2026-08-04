class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int a=m;
        int b=n;
        for(int arr[]:ops){
            a=Math.min(a,arr[0]);
            b=Math.min(b,arr[1]);
        }
        return a*b;
    }
}