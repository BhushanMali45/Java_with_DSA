public class f{


    /*    
     *          E                                     5
     *         DI                               4     9
     *        CHL                         3     8     12
     *       BGKN                    2    7     11    14 
     *      AFJMO                1   6    10    12    15
     */
    public static void main(String rags[]){

        int n=5;
        int count=n;

        for(int i=n;i>=1;i--){
               
            for(int j=i;j>1;j--){
                System.out.print("-");
            }

                 int c=count;
            for(int j=n;j>=i;j--){
                System.out.print((char)(c+64));
                c+=j;
            }
            System.out.println();
            count--;

        }

    }
}

