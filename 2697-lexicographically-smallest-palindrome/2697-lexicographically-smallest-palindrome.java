class Solution {
    public String makeSmallestPalindrome(String s) {
        char c[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(c[left]!=c[right]){
                if(c[left]<c[right]){
                    c[right]=c[left];
                }
                else{
                    c[left]=c[right];
                }
            }
            left++;
            right--;
        }
        return new String(c);
    }
}