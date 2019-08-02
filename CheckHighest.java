package july2019project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckHighest {
    static public void main(String arg[]){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter your no's:");
        String str=x.nextLine();
        int n,gt=0,lt=0; boolean flag=true;
        StringTokenizer st=new StringTokenizer(str," ");
        while(st.countTokens()>0)
        {
            n=Integer.parseInt(st.nextToken());
            if(flag){
                gt=lt=n;
                flag=false;
            }
            else if(n>gt)
                gt=n;
            else if(n<lt)
                lt=n;
        }    
        System.out.print("greates no:"+gt+"\nleast no:"+lt);
    }
}
