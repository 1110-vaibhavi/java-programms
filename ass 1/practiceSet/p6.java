import java.util.Scanner;
public class p6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        boolean isleap=false;
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            isleap=true;
        }
        if(isleap){
            System.out.println(year+" is a leap year");
        }else{
               System.out.println(year+" is  not a leap year");
        }
        sc.close();
    }
}