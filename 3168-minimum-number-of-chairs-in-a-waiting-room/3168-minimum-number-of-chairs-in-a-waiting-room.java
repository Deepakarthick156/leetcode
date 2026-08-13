class Solution {
    public int minimumChairs(String s) {
        int ec=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='E'){
                ec++;
            }
            else{
                ec--;
            }
            max=Math.max(ec,max);
        }
        return max;
    }
}