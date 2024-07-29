public class reversearray {

    // public static void printarray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+",");
    //     }
    //     System.out.println("");

    // }

    // public static void reversearray(int arr[]){
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]+",");
    //     }
    //     System.out.println("");

    // }

    public static void swaparray(int arr[]){
        int start=0,end=arr.length-1;

        for(;start<end;){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+",");
        // }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,8,3};
        // printarray(arr);
        // reversearray(arr);
        swaparray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
