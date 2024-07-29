
// package 2;

// public class linear {
   
    
//         static int LinearSearch(int[] arr, int n, int element){
            
//             for(int i=0;i<n;i++){
            
//             if(arr[i] == element){
                
//                 // Return index, if the given element 
//                 // matches with any element of array.
//                 return i;
//             }
//         }
        
//         // If the given number not found.
//         return -1;
                
    
//         }
//         public static void main(String[] args) {
    
//             // Let size of array be 5 and element 
//             // to be searched for be 7.
//             int n = 5, element = 7;
//             int[] arr = {1,3,5,7,8};
//            System.out.println(LinearSearch(arr,n,element));
//         }
     
// }









// public class linear {
   
    
//         static int LinearSearch(int[] arr, int n, int element){
            
//             for(int i=n-1;i>=0;i--){
            
//             if(arr[i] == element){
                
//                 // Return index, if the given element 
//                 // matches with any element of array.
//                 return i;
//             }
//         }
        
//         // If the given number not found.
//         return -1;
                
    
//         }
//         public static void main(String[] args) {
    
//             // Let size of array be 5 and element 
//             // to be searched for be 7.
//             int n = 7, element = 7;
//             int[] arr = {1,3,5,7,5,7,8};
//            System.out.println(LinearSearch(arr,n,element));
//         }
     
// }



import java.util.ArrayList;

public class linear {
   
    static ArrayList<Integer> LinearSearch(int[] arr, int n, int element) {
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                // Add index to the list if the element matches
                indices.add(i);
            }
        }

        // If the list is empty, return a list containing only -1
        if (indices.isEmpty()) {
            indices.add(-1);
        }
        
        return indices;
    }

    public static void main(String[] args) {
        // Define the size of the array and the element to be searched
        int n = 7, element = 7;
        int[] arr = {1, 3, 5, 7, 8, 7, 4};

        // Perform the linear search and get all occurrences
        ArrayList<Integer> result = LinearSearch(arr, n, element);

        // Print the results
        System.out.println("Element found at indices: " + result);
    }
}
