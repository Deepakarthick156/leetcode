class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>s1=new HashSet<>();
        for(char c:word.toCharArray()){
            if(word.indexOf(c)>=0&&word.indexOf((char)(c+32))>=0){
                s1.add(c);
            }
        }
        return s1.size();
    }
}