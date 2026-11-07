package Sorting;

public class MergeSortArray {
    
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        // int[] nums1 = {1};
        // int[] nums1 = {0};

        int m = 3;

        int[] nums2 = {2,5,6};
        // int[] nums2 = {};
        // int[] nums2 = {1};

        int n = 3;

        merge(nums1, m, nums2, n);
        for(int value : nums1)
        {
            System.out.print(value);
        }
        
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n == 0)
            return;
        int len1 = nums1.length;
        int end_idx = len1-1;
        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[end_idx] = nums2[n-1];
                n--;
            }else{
                nums1[end_idx] = nums1[m-1];
                m--;
            }
            end_idx--;
        }
        while (n > 0) {
            nums1[end_idx] = nums2[n-1];
            n--;
            end_idx--;
        }
    }
}
