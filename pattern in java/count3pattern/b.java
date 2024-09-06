public class b{


    /*    
     *          O                        15
     *         NM                   14   13
     *        LKJ               12  11   10
     *       IHGF           9   8   7    6
     *      EDCBA      5    4   3   2    1
     */
    public static void main(String rags[]){

        int n=5;
        int count=(n*(n+1))/2;

        for(int i=n;i>=1;i--){

            for(int j=i;j>1;j--){
                System.out.print("-");
            }


            for(int j=i;j<=5;j++){
                System.out.print((char)(count+64));
                count--;
            }
            System.out.println();

        }

    }
}
