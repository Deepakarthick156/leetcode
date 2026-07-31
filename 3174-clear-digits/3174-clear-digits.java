class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                st.push(c);
            }
            else{
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}