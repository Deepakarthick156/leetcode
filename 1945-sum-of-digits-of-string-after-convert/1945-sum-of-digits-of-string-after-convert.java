class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            int n=c-'a'+1;
            sb.append(n);
        }
        int count=0;
        int sum=0;
        for(int i=0;i<sb.length();i++){
            sum=sum+(int)(sb.charAt(i)-'0');
        }
        k--;
        
        while(k!=0){
            int temp=sum;
            int sum1=0;
            while(temp!=0){
                int r=temp%10;
                sum1=sum1+r;
                temp=temp/10;
            }
            k--;
            sum=sum1;
        }
        return sum;
    }
}