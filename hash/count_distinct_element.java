// import java.util.*;

// public class count_distinct_element {
//     //count_distinct_element
//     //imp


//     public static void main(String args[]){
//         int num[]={4,3,2,5,6,7,3,4,2,1};
//         HashSet<Integer>set=new HashSet<>();

//         for(int i=0;i<num.length;i++){
//             set.add(num[i]);
//         }

//         System.out.println("size of set"+set.size());
//         System.out.println(set);
      

        
//     }
// }

import java.util.*;

public class count_distinct_element{

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3};  // Input array, assumed to be sorted
        int i = 0;  // Pointer for the last unique element

        for (int j = 1; j < arr.length; j++) {  // Loop through the array
            if (arr[j] != arr[i]) {  // Check if the current element is different from the last unique element
                i++;  // Move the pointer to the next position
                arr[i] = arr[j];  // Replace with the next unique element
            }
        }

        // The number of unique elements is i + 1
        System.out.println("Number of unique elements: " + (i + 1));

        // Print the unique elements
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
