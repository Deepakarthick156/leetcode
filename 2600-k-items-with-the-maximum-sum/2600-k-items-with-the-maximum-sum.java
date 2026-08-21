class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        while(k!=0&&numOnes!=0){
            sum=sum+1;
            k--;
            numOnes--;
        }
         while(k!=0&&numZeros!=0){
            sum=sum+0;
            k--;
            numZeros--;
        }
         while(k!=0&&numNegOnes!=0){
            sum=sum-1;
            k--;
            numNegOnes--;
        }
        return sum;
    }
}