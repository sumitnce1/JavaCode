package july2019project;
class Outer{
    int a=5;
    static int b=10;
    public void disp(){
        System.out.println("a="+a+",b="+b);
    }
    static class Inner{
        int c=20;
        public void show(){
            //System.out.println("value of a="+a);
            System.out.println("value of b="+b);
            System.out.println("value of c="+c);
        }
    }
}
public class StaticNested {
    public static void main(String arg[]){
        Outer.Inner x=new Outer.Inner();
        x.show();
        //x.disp();
        Outer p=new Outer();
        p.disp();
    }
}
