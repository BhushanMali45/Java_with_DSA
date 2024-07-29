public class linearsearch{



    public static int linearserach(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
return -1;
    }

    
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12};
        int key=10;


    int index=linearserach(arr, key);
    
    if(index==-1){
        System.out.print("key not found");
    }else{
        System.out.print("key   found = "+index);

    }

    }
}