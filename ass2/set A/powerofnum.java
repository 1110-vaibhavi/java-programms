import java.util.Scanner;
public class powerofnum{
    public static int power(int b,int e){
        if(e==0){
            return 1;
        }
        return b*power(b,e-1);
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter base:");
        int base=sc.nextInt();
        System.out.println("enter exponent:");
        int exponent=sc.nextInt();
        long result=power(base,exponent);
        System.out.println(base+" raised to the power of "+exponent+" is "+result);
    }
}