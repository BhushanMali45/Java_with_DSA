public class e{


    /*    
     *          A                                     1
     *         BF                               2     6
     *        CGJ                         3     7     10
     *       DHKM                    4    8     11    13 
     *      EILNO                5   9    12    14    15
     */
    public static void main(String rags[]){

        int n=5;
        int count=1;

        for(int i=n;i>=1;i--){
               
            for(int j=i;j>1;j--){
                System.out.print("-");
            }

                 int c=count;
            for(int j=n;j>=i;j--){
                System.out.print((char)(c+64));
                c+=j-1;
            }
            System.out.println();
            count++;

        }

    }
}

