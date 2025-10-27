import java.util.*;
Public class Merge2SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter elements of nums1 array followed by extra space for nums2:");
        for (int i = 0; i < m+m; i++) {
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of nums2 array in sorted order:");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        

        merge(nums1, m, nums2, n);

        // Print merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }

    }
}
//Time Complexity: O(k) where k = m + n
//Space Complexity: O(1)