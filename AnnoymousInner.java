package july2019project;
abstract class outer{
    abstract public void disp();
}
public class AnnoymousInner {
    public static void main(String arg[]){
        outer p=new outer(){
            public void disp(){
                System.out.println("welcome to world");
            }
        };
        p.disp();
    }
}
