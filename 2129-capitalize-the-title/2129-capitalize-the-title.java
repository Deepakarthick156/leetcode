class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String words[]=title.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String str:words){
            if(str.length()>2){
                sb.append(Character.toUpperCase(str.charAt(0)));
                sb.append(str.substring(1,str.length()));
                sb.append(' ');
            }
            else{
                sb.append(str);
                sb.append(' ');
            }
           
        }
        return sb.toString().trim();
    }
}