class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String n=num+"";
        for(int i=0;i<=n.length()-k;i++){
            String sub=n.substring(i,i+k);
            int div=Integer.parseInt(sub);
            if(div!=0){
                if(num%div==0){
                    count++;
                }
            }
        }
        return count;
    }
}