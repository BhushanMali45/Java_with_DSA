public class binarysearch {//sorted array pahije binary search sathi


    public static int binarysearch(int arr[],int key){

        int start=0;
        int end=arr.length-1;

        for(;start<=end;){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int key=3;
        int index=binarysearch(arr, key);

        if(index==-1){
            System.out.print("key not found");
        }else{
            System.out.print("key   found = "+index);
    
        }

    }
}
