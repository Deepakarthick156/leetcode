class Solution {
    public int minimumPushes(String words) {
        if(words.length()<=8)return words.length();
        int count=words.length()/8;
        int rem=words.length()%8;
        int total=0;
        while(count!=0){
            total+=count*8;
            count--;
        }
        return total+rem*(words.length()/8+1);
    }
}