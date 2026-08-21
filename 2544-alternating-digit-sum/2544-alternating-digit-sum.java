class Solution {
    public int alternateDigitSum(int n) {
        long sum=0;
        String res=n+"";
        for(int i=0;i<res.length();i++){
            if(i%2==0){
                sum=sum+Character.getNumericValue(res.charAt(i));
            }
            else{
                sum=sum-Character.getNumericValue(res.charAt(i));
            }
        }
        return (int)sum;
    }
}