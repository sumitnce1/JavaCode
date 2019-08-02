package july2019project;
public class Cline {
    public static void main(String arg[]){
        if(arg.length==0)
            System.out.println("Arguments must be passed at command prompt!");
        else{
            int n,d;byte pr=0,cm=0;
            for(String s:arg){
                n=Integer.parseInt(s);
                for(d=2;d<=n/2;d++)
                    if(n%d==0)
                        d=n;
                if(d>n && n!=1 && n!=0)
                    cm++;
                else if(n!=1 && n!=0)
                    pr++;
            }
            System.out.println("Tota prime:"+pr+"\nTotal composite:"+cm);
        }
    }
}
