
class Demo
{
    int a,b,temp;
    void m1()
    {
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("value of A:"+a);
        System.out.println("value of B is:"+b);
    }
}



public class Swapno {
    public static void main(String args[])
    {    
        Demo d1=new Demo();
        d1.a=10;
        d1.b=20;
        d1.m1();

    }
    
}
