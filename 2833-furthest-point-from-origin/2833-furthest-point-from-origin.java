class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int rc=0;
        int b=0;
        int lc=0;
        for(char c:moves.toCharArray()){
            if(c=='R'){
                rc++;
            }
            else if(c=='L'){
                lc++;
            }
            else{
                b++;
            }
        }
        return Math.abs(lc-rc)+b;
    }
}