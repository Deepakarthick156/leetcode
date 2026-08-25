class Solution {
    public int partitionString(String s) {
        Set<Character>set=new HashSet<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }
            else{
                set.clear();
                count++;
                set.add(c);
            }
        }
        return count+1;
    }
}