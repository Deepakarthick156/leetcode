class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int left1=0;
        int left2=0;
        while(left1<nums1.length&&left2<nums2.length){
            if(nums1[left1]==nums2[left2]){
                return nums1[left1];
            }
            if(nums1[left1]<nums2[left2]){
                left1++;
            }
            else{
                left2++;
            }
        }
        return -1;
    }
}