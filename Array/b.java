


// It then iterates through the array:
// If the current element arr[i] is smaller than the current smallest number small, it updates second_small to small and small to arr[i].
// If the current element arr[i] is not smaller than small but is smaller than second_small and is not the same as small, it updates second_small to arr[i].
// Finally, it returns the value of second_small, which holds the second smallest number found in the array.


public class b{
    public static int smallest(int arr[],int n){
       if(n<2){
       return -1;
       }

       int smallest=Integer.MAX_VALUE;
       int second_small=Integer.MAX_VALUE;

       for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            second_small=smallest;
            smallest=arr[i];
            
        }else if(arr[i]<second_small && arr[i]!=smallest){
            second_small=arr[i];        }
       }
       return second_small;
    }




    public static int largest(int arr[],int n){
        if(n<2){
        return -1;
        }
 
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
 
        for(int i=0;i<arr.length;i++){
         if(arr[i] > largest){
             second_largest=largest;
             largest=arr[i];
             
         }else if(arr[i]>second_largest && arr[i]!=largest){
             second_largest=arr[i];        }
        }
        return second_largest;
     }





    public static void main(String args[]){
        int[] arr = {1, 2, 4, 7, 7, 5};
    
        System.out.println(smallest(arr, arr.length));
        System.out.println(largest(arr, arr.length));
    }
}














// // import java.util.*;
// // public class b {

// //     public static int largesmall(int arr[]){
// //         Arrays.sort(arr);
// //         // return arr[1];
// //         return arr[arr.length-2];
        
// //     }
// //     public static void main(String args[]){
// //         int arr1[]={2,5,1,3,0};
// //         int arr2[]={8,10,5,7,9};
// //        System.out.println( largesmall(arr1));
// //         largesmall(arr2);
// //     }
// // }
