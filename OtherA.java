package otherpackage;
class C extends july2019project.A
{
    public void check(){
        System.out.println("check called");
        System.out.println("value of a="+a);
    }
}        
public class OtherA {
    public static void main(String arg[]){
        C p=new C();
        p.check();
        System.out.println("value of a="+p.a);
    }
}
