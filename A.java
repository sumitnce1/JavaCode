package july2019project;
public class A
{
    public int a=10;
    public void disp()
    {
        System.out.println("value of a="+a);
    }        
}
class B extends A{
    public void show()
    {
        System.out.println("show called");
        System.out.println("value of a="+a);
    }        
}
class Test{
    public static void main(String arg[]){
        B x=new B();
        x.disp();
        x.show();
        System.out.println("value of a="+x.a);
    }
}
