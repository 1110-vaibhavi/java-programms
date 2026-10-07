import java.util.Scanner;
public class factorial{
    public static void main(String []args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Finding Factorial of Given number!!!!!!!");
         System.out.println("Enter Your Number :");
            int n = sc.nextInt();
        System.out.println("The factorial of n is:"+ factorial(n));
    }
    public static int factorial(int n){
            if(n==0){
                return 1;
            }
            return n*factorial(n-1);
        }
}