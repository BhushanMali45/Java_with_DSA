
class Demo
{
    int a,b,temp;
    int m1()
    {
          temp=a;
          a=b;
          b=temp;
          return a;
          return b;
          

    }
}

public class SwapNAWithR

 {
    Demo d1=new Demo();
    d1.a=10;
    d1.b=20;
    System.out.println(d1.m1(a));
    //System.out.println(d1.swap(a));
    System.out.println(d1.m1(b));
    
}
