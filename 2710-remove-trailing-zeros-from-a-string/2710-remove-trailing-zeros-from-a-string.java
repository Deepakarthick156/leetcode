class Solution {
    public String removeTrailingZeros(String num) {
        Stack<Character>s1=new Stack();
        for(char c:num.toCharArray()){
            s1.push(c);
        }
        while(s1.peek()=='0'&&!s1.isEmpty()){
            s1.pop();
        }
        StringBuilder sb=new StringBuilder();
        for(char c:s1){
            sb.append(c);
        }
        return sb.toString();
    }
}