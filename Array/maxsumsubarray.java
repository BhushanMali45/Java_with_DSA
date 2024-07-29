public class maxsumsubarray {


    public static void maxsumsubarray(int arr[]){
   int currsum=0;
   int maxsum=Integer.MIN_VALUE;
   int minsum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;

                currsum=0;
                for(int k=start;k<=end;k++){
                    // System.out.print(arr[k]);
                    currsum+=arr[k];
                }
                if(maxsum <currsum){
                    maxsum=currsum;
                }

                if(minsum>currsum){
                    minsum=currsum;
                }
            }
           
        }
        System.out.println("maxsum is "+maxsum);
        System.out.println("minsum is "+minsum);


    }
    public static void main(String args[]){
        int arr[]={1,-3,2};
        maxsumsubarray(arr);

    }
}
