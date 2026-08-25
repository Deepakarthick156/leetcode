class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int count=0;
       int temp=numBottles;
       int empty=0;
       while(temp>=numExchange)
        {
            int q=temp/numExchange;
            count=count+q;
            temp=q+temp%numExchange;
        }
        return count+numBottles;
    }
}