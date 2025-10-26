/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */







class MedianofTwoArraysSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum =0;
        int l = nums1.length + nums2.length;
        double res[] = new double[l];
        double val = 2.0;
        int count =0;
        for(int n: nums1){
            res[count++]= n;
        }
         for(int n1: nums2){
            res[count++]= n1;
        }
        Arrays.sort(res);
        if(res.length%2==0){
           int mid = l/2;
           return (res[mid]+res[mid-1])/val;
       }
       else{
        int mid1 = l/2;
        return res[mid1];
       }
       
    }
}
