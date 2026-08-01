class Solution {
    public String makeGood(String s) {
        Stack<Character>s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(!s1.isEmpty()){
                if(Math.abs(c-s1.peek())==32){
                    s1.pop();
                    continue;
                }
            }
            s1.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char a:s1){
            sb.append(a);
        }
        return sb.toString();
    }
}