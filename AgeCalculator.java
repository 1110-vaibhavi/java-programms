import java.util.Scanner;
public class AgeCalculator{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your Birth Year :");
        int birthyear = sc.nextInt();
         int currentyear=2026;
         int age=currentyear-birthyear;
         System.out.println("Hello "+name+" Your Age is "+age);
        sc.close();
    }
}