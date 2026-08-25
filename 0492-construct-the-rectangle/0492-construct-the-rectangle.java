class Solution {
    public int[] constructRectangle(int area) {
        
        for(int i=area-1;i>=1;i--){
            if(area%i==0){
                int q=area/i;
                if(q>=i){
                    return new int[]{q,i};
                }
            }
        }
        return new int[]{1,1};
    }
}