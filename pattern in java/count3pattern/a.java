public class a{


    /*    
     *          A                       1
     *         BC                   2   3
     *        DEF               4   5   6
     *       GHIJ           7  8   9   10
     *      KLMNO    11    12 13   14  15
     */
    public static void main(String rags[]){

        int n=5;
        int count=1;

        for(int i=1;i<=n;i++){

            for(int j=i;j<n;j++){
                System.out.print("-");
            }


            for(int j=i;j>=1;j--){
                System.out.print((char)(count+64));
                count++;
            }
            System.out.println();

        }

    }
}