import java.util.Scanner;
public class p4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int term=sc.nextInt();
        int a=0;
        int b=1;
       for(int i=1;i<=term;i++){
        System.out.println(a+" ");
        int c=a+b;
        a=b;
        b=c;
       }
        sc.close();
    }
}