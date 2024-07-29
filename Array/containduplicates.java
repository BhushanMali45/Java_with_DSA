import java.util.*;

public class containduplicates {

    public static boolean containsDuplicate(int nums[]){
        //sort
        Arrays.sort(nums);

        //   System.out.print(Arrays.toString(nums));//print

        
for(int i:nums){
        System.out.print(i+" ");
        }


        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){// // Check if any adjacent elements are equal
                return true;     // If adjacent elements are equal, it's a duplicate

            }
        }
        return false; // If the loop completes without finding any duplicates, return false

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));  // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));  // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3));  // Output: true

        
    }
}
