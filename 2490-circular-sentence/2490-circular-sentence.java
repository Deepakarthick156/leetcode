class Solution {
    public boolean isCircularSentence(String sentence) {
        String words[]=sentence.split("\\s+");
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))return false;
        for(int i=1;i<words.length;i++){
            String a=words[i-1];
            String b=words[i];
            if(a.charAt(a.length()-1)!=b.charAt(0))return false;

        }
        return true;
    }
}