class Solution {
    public int minLength(String s) {
        Stack<Character>st=new Stack<>();
        String str="ABCD";
        for(char c:s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek()+1==c&&(st.peek() == 'A' && c == 'B'||
                st.peek() == 'C' && c == 'D')){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        return st.size();
    }
}