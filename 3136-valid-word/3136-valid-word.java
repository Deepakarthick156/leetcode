class Solution {
    public boolean isValid(String word) {
        boolean vowel=false;
        boolean cons=false;
        boolean isdigit=false;
        int cc=0;
        if(word.length()<3)return false;
        word=word.toLowerCase();
        for(char c:word.toCharArray()){
            if(c=='@'||c=='#'||c=='$'){
                return false;
            }
            else if(c>=48&&c<=57){
                continue;
            }
            else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel=true;
                cc++;
            }
            else{
                cons=true;
                cc++;
            }
        }
        if(vowel&&cons){
            return true;
        }
        return false;
    }
}