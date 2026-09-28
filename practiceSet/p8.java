//arithmatic op on two no. using command line argument
import java.io.*;
public class p8{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        System.out.println("Addition : "+(a+b));
         System.out.println("Subtraction : "+(a-b));
          System.out.println("Multiplication : "+(a*b));
          if(a==0){
            System.out.println("a can't be zero");
          }else{
           System.out.println("Division : "+(a/b));
          }
             System.out.println("Modulas : "+(a%b));
    }
}