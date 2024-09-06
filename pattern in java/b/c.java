import java.util.*;
public class c{

    public  int[] ag(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%4==0 && arr[i]%6!=0){
               arr[i]=-1;
            }
            else if(arr[i]%6==0 && arr[i]%4!=0){
               arr[i]=-2;
            }
            else if(arr[i]%4==0 && arr[i]%6==0){
               arr[i]=-3;
            }
           
          
        }
       return arr;
    }
    public static void main(String args[]){
        int arr[]={14,25,18,23,24,30,12,28,16,22,26};
        c obj=new c();
        // int []res=obj.ag(arr); 

        // for(int i=0;i<res.length;i++ ){

        // System.out.print(arr[i]+" ");
        // }

  );


       
    }
}