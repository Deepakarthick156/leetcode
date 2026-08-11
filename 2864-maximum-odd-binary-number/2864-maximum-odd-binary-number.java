class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oc=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                oc++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(oc>1){
                oc--;
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        sb.append('1');
        return sb.toString();
    }
}