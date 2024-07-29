

// public class leftrotated {



// static void solve(int arr[], int n) {
//   int temp = arr[0]; // storing the first element of array in a variable
//   for (int i = 1; i < n ; i++) {
//     arr[i-1] = arr[i];
//   }
//   arr[n - 1] = temp; // assigned the value of variable at the last index
//   for (int i = 0; i < n; i++) {
//     System.out.print(arr[i]+" ");
//   }

  
// }
// public static void main(String args[]) {
 
//   int arr[]= {1,2,3,4,5};
//   solve(arr, arr.length);
// }
// }







public class leftrotated {



static void solve(int arr[], int n) {
  int temp=arr[n-1];
  for(int i=n-2;i>=0;i--){
   arr[i+1]=arr[i];

  }
  arr[0]=temp;
    for (int i = 0; i < n; i++) {
    System.out.print(arr[i]+" ");
  }
  
  

 
  
}
public static void main(String args[]) {
 
  int arr[]= {1,2,3,4,5};
  solve(arr,arr.length);
 
}
}




 

