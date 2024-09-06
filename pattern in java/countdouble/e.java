public class e{
    // Ea    Db   Cd   Bg   AK
    // Ic     He  Gh   Fl 
    // Lf     ki   jm 
    // Nj     MN
    // Oo

    // 5   4   3   2   1
    // 9   8   7    6
    // 12  11  10
    // 14   13
    // 15


    // 1   2   4   7    11
    // 3   5   8   12
    // 6   9   13
    // 10  14
    // 15
     public static void main(String args[]){

     int n=5;
     int count=n;
     int count2=1;
    //  System.out.println(count2);

            for(int i=n,i1=1 ; i>=1 || i1<=n;i1++ ,i--){
             

           

             int c=count;
             int c2=count2;
            for(int j=i,j1=i1; j>=1||j1<=n;j1++,j--){
              
                   System.out.print((char)(c+64));
                   System.out.print((char)(c2+96));
                   System.out.print("\t");
                   c--;
                   c2+=j1;
            }
            System.out.println();
            count+=i-1;
            count2+=i1+1;

        }

    }
}