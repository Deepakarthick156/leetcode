class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<res.length;i++){
            int num=i;
            int count=0;
            while(num!=0){
                int rem=num%2;
                if(rem==1){
                    count++;
                }
                num=num/2;
            }
            res[i]=count;
        }
        return res;
    }
}