public class largest {
   //largest value in array and minimum value in array
   
   

   public static void getminandmaxvalue(int arr[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//+infinity

        for(int i=0;i<arr.length;i++){
          if(largest <arr[i]){
           largest=arr[i];
          }

          if(smallest > arr[i]){
            smallest=arr[i];
           }
        }

        System.out.println("smallest value in array = "+smallest);
        System.out.println("largset = "+largest);

   }
   public static void main(String args[]){
    int arr[]={1,4,5,2,6,3};
    getminandmaxvalue(arr);
   }
}
