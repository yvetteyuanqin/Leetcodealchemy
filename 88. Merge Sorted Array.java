class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pm=m-1,pn=n-1,end=m+n-1;
        while(pm>=0&pn>=0){
            nums1[end--] = nums1[pm]>nums2[pn] ? nums1[pm--]:nums2[pn--];
            
        }
        //while(pn>=0)    nums1[n--]=nums2[pn--];
        while(pn>=0)    nums1[end--]=nums2[pn--];//only need to consider pn, if pm arrives 0 first than we need to deal with the rest of array2
    }
}