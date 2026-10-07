import java.util.Scanner;
public class a2{
    public static void main(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Perfect numbers between 1 to n:");
        for(int num=2;num<=n;num++){
            int divisor_sum=1;
            for(int i=2;i*i<=num;i++){
                if(num % i== 0){
                    divisor_sum +=i;
                    if(i*i != num){
                        divisor_sum += num/i;
                    }
                }
            }
            if(divisor_sum==num){
                System.out.println(num);
            }
        }
        sc.close();
    }
}