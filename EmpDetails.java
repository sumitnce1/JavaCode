package july2019project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmpDetails {
    public static void main(String arg[]){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter eno,name and salary:");
        StringTokenizer st=new StringTokenizer(x.next(),",");
        System.out.println("Employee no    :"+st.nextToken());
        System.out.println("Employee name  :"+st.nextToken());
        System.out.println("Employee salary:"+st.nextToken());
    }
}
