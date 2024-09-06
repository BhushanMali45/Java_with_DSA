public class d{


//                          OA
//                     JC   NB  
//               FF    IE  MD
//         CJ    EI    HH  LG
//    AO    BN   DM    GL  KK

//                     15
//                 10  14
//           6     9  13
//       3   5     8  12
// 1    2    4    7   11
           

//                      1
//                  3   2
//            6     5   4
//      10    9    8    7
// 15   14   13   12   11


     public static void main(String args[]){

     int n=5;
     int count=((n*(n+1))/2);
     int count2=1;
     System.out.println(count2);

        for(int i=n,i1=1;i>=1 || i1<=n;i--,i1++){

             for(int j=i;j>1 ;j--){

                System.out.print("\t");

             }

             int c=count;
             int c2=count2;
            for(int j=i;j<=n;j++){
                   System.out.print((char)(c+64));
                   System.out.print((char)(c2+64));
                   System.out.print("\t");
                   c+=j;
                   c2--;
            }
            System.out.println();
            count-=i;
            count2+=i1+1;

        }

    }
}