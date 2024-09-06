
class Demo
{
    int temp;
    int m1(int a,int b)
    {
        temp=a;
        a=b;
        b=temp;
        return a;
        return b;
    }
}



public class WArguWithR 
{
    public static void main(String args[])
    {
        Demo d1=new Demo();
        System.out.println(d1.m1(10, 20));
        
        

    }
    
}
