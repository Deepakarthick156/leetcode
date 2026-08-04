class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int count=0;
        for(int i:freq){
            count+=i/2*2;
        }
        if(count<s.length()){
            count++;
        }
        return count;
    }
}