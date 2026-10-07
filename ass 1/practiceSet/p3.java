//generating table using commandline argument
import java.io.*;
public class p3{
    public static void main(String args[]){
         System.out.println("the multiplication table is:");
         int number=Integer.parseInt(args[0]);
        for(int j=0;j<=10;j++){
        System.out.println(number+"x"+j+"="+(number)*j);
       
       }
       
        
    }
}