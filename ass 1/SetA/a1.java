import java.util.Scanner;
public class a1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    isPrime=true;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("The no. is prime.");
        }else{
            System.out.println("The no is not prime.");
        }
    }
}