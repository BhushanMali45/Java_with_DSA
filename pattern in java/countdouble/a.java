public class a{

    //    AO   FM  JJ   MF   OA       1     6     10     13    15
    //         BN  GK   KG   NB             2      7     11    14
    //             CL   HH   LC                    3      8    12
    //                  DI   ID                           4     9
    //                       EE                                 5



    // 15      13    10    6  1
    //         14    11    7  2
    //               12    8  3
    //                     9  4
    //                        5
     public static void main(String args[]){

     int n=5;
     int count=1;
     int count2=((n*(n+1))/2);
     System.out.println(count2);

        for(int i=1;i<=n;i++){

             

             for(int j=i;j>1;j--){

                System.out.print("\t");

             }

             int c=count;
             int c2=count2;
            for(int j=n,j1=i;j>=i|| j1<=n;j--,j1++){
                   System.out.print((char)(c+64));
                   System.out.print((char)(c2+64));
                   System.out.print("\t");
                   c+=j;
                   c2-=j1+1;
            }
            System.out.println();
            count++;
            count2-=i;

        }

    }
}