class Solution {
    public int commonFactors(int a, int b) {
        List<Integer>l1=new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                l1.add(i);
            }
        }
        int count=0;
        for(int i=1;i<=b;i++){
            if(b%i==0){
                if(l1.contains(i)){
                    count++;
                }
            }
        }
        return count;
    }
}