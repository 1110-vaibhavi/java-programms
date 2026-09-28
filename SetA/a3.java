import java.util.Scanner;
public class a3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employe name:");
        String empname=sc.nextLine();
        int length=empname.length();
        String rev="";
        for(int i=length-1 ;i>=0; i--){
            rev= rev+empname.charAt(i);
        }
        System.out.println(rev);
    }
}