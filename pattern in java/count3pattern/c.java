public class c{


    /*    
     *          A                              1
     *         CB                         3    2
     *        FED                  6      5    4
     *       JIHG            10    9      8    7 
     *      ONMLK      15    14    13    12    11
     */
    public static void main(String rags[]){

        int n=5;
        int count=1;

        for(int i=1;i<=n;i++){
               
            for(int j=i;j<n;j++){
                System.out.print("-");
            }

                 int c=count;
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+64));
                c--;
            }
            System.out.println();
            count+=i+1;

        }

    }
}
