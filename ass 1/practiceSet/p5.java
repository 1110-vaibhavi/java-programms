import java.util.Scanner;
public class p5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0,rem=0;
        while(num>0){
            rem=num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("The sum of digit is :"+sum);
    }

}