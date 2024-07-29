import java.util.*;
public class maxsubarrayproduct {
   


    public static  void kadnesalgo(int arr[]){
   int currproduct=1;
   int maxproduct=Integer.MIN_VALUE;

   for(int i=0;i<arr.length;i++){
    currproduct=currproduct*arr[i];
    if(currproduct <0){
        currproduct=1;
    }

    maxproduct=Math.max(currproduct, maxproduct);
   }
   System.out.println(maxproduct);

    }
public static void main(String args[]){
    int arr[]={2,3,-2,4};
    kadnesalgo(arr);

}
}

