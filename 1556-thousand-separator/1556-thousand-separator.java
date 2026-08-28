class Solution {
    public String thousandSeparator(int n) {
        String str=n+"";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i!=0&&(str.length()-i)%3==0){
                sb.append(".");
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}