class Solution {
    public int minOperations(String[] logs) {
        Stack<String>s1=new Stack<>();
        for(String s:logs){
            if(s.equals("../")&&!s1.isEmpty()){
                s1.pop();
            }
            else if(s.equals("./")){
                continue;
            }
            else if(!s.equals("../")){
                s1.push(s);
            }
        }
        return s1.size();
    }
}