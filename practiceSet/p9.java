import java.util.Scanner;
public class p9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int last_digit=num%10;
        int first_digit=0;
        while (num>=10){
            num=num/10;
        }
        first_digit=num;
        System.out.println("The First and the last digit sum is :"+(first_digit+last_digit));
    }
}