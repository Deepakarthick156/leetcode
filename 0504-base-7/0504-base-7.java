class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        int temp=Math.abs(num);
        StringBuilder sb=new StringBuilder();
        while(temp!=0){
            int rem=temp%7;
            sb.append(rem+"");
            temp=temp/7;
        }
        if(num<0){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}