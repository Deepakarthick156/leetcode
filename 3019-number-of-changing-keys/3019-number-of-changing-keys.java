class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek()==c){
                    continue;
                }
            }
            st.push(c);
        }
        return st.size()-1;
    }
}