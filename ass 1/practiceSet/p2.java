//finding max & min between 3 no.
import java.io.*;
import java.util.Scanner;
public class p2{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         int a = sc.nextInt();
         int b= sc.nextInt();
         int c= sc.nextInt();
         System.out.println("Finding the Maximum and minimum :");
         int max=((a>b)?(a>c)?a:c : (b>c)?b:c);
         System.out.println("Max of three no. is : "+ max);
         int min=((a<b)?(a<c)?a:c:(b<c)?b:c);
         System.out.println("Mini of three no. is : "+ min);
    }
}