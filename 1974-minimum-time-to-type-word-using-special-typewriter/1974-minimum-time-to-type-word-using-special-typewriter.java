class Solution {
    public int minTimeToType(String word) {
        int time=0;
        char pointer='a';
        for(char c:word.toCharArray()){
            int clockwise=Math.abs(c-pointer);
            int counter=26-clockwise;
            time=time+Math.min(clockwise,counter)+1;
            pointer=c;
        }
        return time;
    }
}