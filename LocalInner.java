package july2019project;
public class LocalInner {
    int a=10;
    public void disp(){
        class Inner{
            private int b=20;
            public void show(){
                System.out.println("value of a="+a);
                System.out.println("value of b="+b);
            }
        }
        //System.out.println("value of b="+b);
        Inner p=new Inner();
        p.show();
        System.out.println("value of b="+p.b);
    }
    public static void main(String arg[]){
        new LocalInner().disp();
        //Inner t=new Inner();
    }
}
