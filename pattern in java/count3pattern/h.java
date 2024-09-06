public class h{


    /*    
     *          K                                       11
     *         LG                                 12    7
     *        MHD                            13   8     4
     *       NIEB                      14    9    5    2 
     *      OJFCA                 15   10    6    3    1
     */
    public static void main(String rags[]){

        int n=5;
        int count=(n*(n-1))/2+1;

        for(int i=n;i>=1;i--){
               
            for(int j=i;j>1;j--){
                System.out.print("-");
            }

                 int c=count;
            for(int j=n;j>=i;j--){
                System.out.print((char)(c+64));
                c-=j;
            }
            System.out.println();
            count++;

        }

    }
}

