import java.util.Arrays;

public class choclates {
         /**
     * Calculates the minimum difference between the maximum and minimum chocolates
     * received by any student after distributing chocolates in packets.
     *
     * @param arr Array representing sizes of chocolate packets.
     * @param m   Number of students.
     * @return Minimum difference between maximum and minimum chocolates.
     */


    public static int choclatesdistrubution(int arr[],int m){
        // if (arr.length == 0 || m == 0) {
        //     return 0;
        // }

        // // Check if there are enough packets for the given number of students
        // if (arr.length - 1 < m) {
        //     // Invalid input
        //     return -1;
        // }

     Arrays.sort(arr);//sort array

     //find  minimum difference
     int min_diff=Integer.MAX_VALUE;

     for(int i=0;i<arr.length;i++){
        int j= i + m - 1;//j means next windows
 
        // Break if the window goes beyond the bounds of the array
        if (j >= arr.length)
            break;


        int diff=arr[j]-arr[i];

        min_diff=Math.min(min_diff, diff);
     }

return min_diff;
    }


    public static void main(String args[]){
        int arr[]={3,4,1,9,56,7,9,12};//number cholates in packtes
        int m=5;//no of student

System.out.println ( choclatesdistrubution(arr, m))  ;
 }
}



// Initially sort the given array. And declare a variable to store the minimum difference, and initialize it to INT_MAX. Let the variable be min_diff.
// Find the subarray of size m such that the difference between the last (maximum in case of sorted) and first (minimum in case of sorted) elements of the subarray is minimum.
// We will run a loop from 0 to (n-m), where n is the size of the given array and m is the size of the subarray.
// We will calculate the maximum difference with the subarray and store it in diff = arr[highest index] – arr[lowest index]
// Whenever we get a diff less than the min_diff, we will update the min_diff with diff.