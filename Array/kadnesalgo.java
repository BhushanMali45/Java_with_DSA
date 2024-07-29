import java.util.*;
public class kadnesalgo{


    public static  void kadnesalgo(int arr[]){
   int currsum=0;
   int maxsum=Integer.MIN_VALUE;

   for(int i=0;i<arr.length;i++){
    currsum=currsum+arr[i];
    if(currsum <0){
        currsum=0;
    }

    maxsum=Math.max(currsum, maxsum);
   }
   System.out.println(maxsum);

    }
public static void main(String args[]){
    int arr[]={1,-3,2};
    kadnesalgo(arr);

}
}










// import java.util.*;
// public class kadnesalgo{


//     public static  void kadnesalgo(int arr[]){
//    int currproduct=1;
//    int maxsum=Integer.MIN_VALUE;

//    for(int i=0;i<arr.length;i++){
//     currproduct=currproduct*arr[i];
//     if(currproduct <0){
//         currproduct=1;
//     }

//     maxsum=Math.max(currproduct, maxsum);
//    }
//    System.out.println(maxsum);

//     }
// public static void main(String args[]){
//     int arr[]={1,-3,2};
//     kadnesalgo(arr);

// }
// }













// import java.util.*;

// public class kadnesalgo {
//     public static void kadanesAlgorithm(int arr[]) {
       

//         // Check if all numbers are negative
//         boolean allNegative = true;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] >= 0) {
//                 allNegative = false;
//                 break;
//             }
//         }

//         if (allNegative) {
//             int maxNegative = Integer.MIN_VALUE;
//             for (int i = 0; i < arr.length; i++) {
//                 maxNegative = Math.max(maxNegative, arr[i]);
//             }
//             System.out.println(maxNegative);
//             return;
//         }

//         // Kadane's Algorithm
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             currSum = Math.max(arr[i], currSum + arr[i]);
//             maxSum = Math.max(currSum, maxSum);
//         }

//         System.out.println(maxSum);
//     }

//     public static void main(String args[]) {
//         int arr[] = {-2, -3, -4, -2};
//         kadanesAlgorithm(arr);
//     }
// }
