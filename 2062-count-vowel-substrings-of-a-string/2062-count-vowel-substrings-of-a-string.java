class Solution {
    public int countVowelSubstrings(String word) {
        Set<Character>set=new HashSet<>();
        int count=0;
        for(int i=0;i<word.length()-4;i++){
            for(int j=i;j<word.length();j++){
                char c=word.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    set.add(c);
                    if(set.size()==5){
                        count++;
                    }
                }
                else 
                {
                    break;
                }
            }
            set.clear();
        }
        return count;
    }
}