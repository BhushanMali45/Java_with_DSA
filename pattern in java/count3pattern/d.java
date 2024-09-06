public class d{


    /*    
     *          O                                  15
     *         MN                             13   14
     *        JKL                        10   11   12
     *       FGHI                   6    7    8    9 
     *      ABCDE              1    2    3    4    5
     */
    public static void main(String rags[]){

        int n=5;
        int count=(n*(n+1))/2;

        for(int i=1;i<=n;i++){
               
            for(int j=i;j<n;j++){
                System.out.print("-");
            }

                 int c=count;
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+64));
                c++;
            }
            System.out.println();
            count-=i+1;

        }

    }
}

