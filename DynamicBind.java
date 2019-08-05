package july2019project;
class AB{
    public void disp(){
        System.out.println("AB disp called!");
    }
    public void check(){
        System.out.println("check called!");
    }
}
class AC extends AB{
    @Override
    public void disp(){
        super.disp();
        System.out.println("AC disp called!");
    }
    public void show(){
        System.out.println("show called!");
    }
}
class AD extends AB{
    @Override
    public void disp(){
        super.disp();
        System.out.println("AD disp called!");
    }
}
public class DynamicBind {
    public static void main(String arg[]){
        AB p;
        p=new AC();
        p.disp();
        p.check();
        //p.show();
        ((AC)p).show();//downcasting
        p=new AD();
        p.disp();
    }
}
