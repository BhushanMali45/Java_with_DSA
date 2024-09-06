public class f{
// EE   DI   CL   BN   AO                       
// ID   HH   GK   FM   
// LC   KG   JJ
// NB   MF
// OA




// 5   4    3   2   1
// 9   8    7   6
// 12  11   10
// 14  13
// 15





// 222 fig


// 5   9   12   14   15
// 4   8    11  13
// 3   7    10
// 2   6
// 1


     public static void main(String args[]){

     int n=5;
     int count=n;
     int count2=n;
    //  System.out.println(count2);

        for(int i=n ,i1=1 ;i>=1 || i1<=n ;i--,i1++){


             int c=count;
             int c2=count2;
            for(int j=i,j1=n;j>=1 || j1>=i1 ;j--,j1--){
                   System.out.print((char)(c+64));
                   System.out.print((char)(c2+64));
                   System.out.print("\t");
                   c--;
                   c2+=j1-1;
            }
            System.out.println();
            count+=i-1;
            count2--;

        }

    }
}
