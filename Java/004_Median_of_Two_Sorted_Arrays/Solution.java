import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            arr[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
        double median=0;
        if(arr.length%2==0){
            median = ((double)arr[arr.length/2] + (double)arr[(arr.length/2)-1]) / 2;

        }
        else{
            median=arr[arr.length/2];
        }
        return median;
    }
}