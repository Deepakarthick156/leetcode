class Solution {
    public int hammingDistance(int x, int y) {
        // StringBuilder sb=new StringBuilder();
        // StringBuilder sb1=new StringBuilder();
        // while(x!=0){
        //     int rem=x%2;
        //     sb.append(rem+"");
        //     x=x/2;
        // }
        // String s1=sb.reverse().toString();
        // while(y!=0){
        //     int rem=y%2;
        //     sb1.append(rem+"");
        //     y=y/2;
        // }
        // String s2=sb1.reverse().toString();
        // int count=0;
        // for(int i=0;i<s2.length();i++){
        //     if(s1.charAt(i)!=s2.charAt(i)){
        //         count++;
        //     }
        // }
        // return count;
        return Integer.bitCount(x^y);
    }
}