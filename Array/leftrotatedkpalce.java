

// public class leftrotatedkpalce {
   



//     // Function to reverse the array
//     static void reverse(int arr[], int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     // Function to left rotate the array by d positions
//     static void leftRotate(int arr[], int n, int k) {

//         // if (n == 0) return;

//         // Get the effective number of rotations
//         k = k % n;

//         // Step 1: Reverse the first part
//         reverse(arr, 0, k - 1);

//         // Step 2: Reverse the second part
//         reverse(arr, k, n - 1);

//         // Step 3: Reverse the entire array
//         reverse(arr, 0, n - 1);
//     }

//     public static void main(String args[]) {
//         int n = 7;
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         int k = 3;

//         System.out.println("Before rotation:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         leftRotate(arr, n, k);

//         System.out.println("After rotation:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }














// right rotaed by array k place 


public class leftrotatedkpalce {
   



    // Function to reverse the array
    static void reverse(int arr[],int start, int end){
      
  
        while(start<end){

      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
        }

    }
   
    

    // Function to left rotate the array by d positions
    static void rightRotate(int arr[], int n, int k) {
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
       


       
    }

    public static void main(String args[]) {
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rightRotate(arr, n, k);
        for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }

    }


}