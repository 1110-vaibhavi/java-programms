import java.util.Scanner;
public class b2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many no.s want to store in array:");
        int n=sc.nextInt();
        int rem=0,sum=0;
        int[] armstongnumbers=new int[n];
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int temp=num;
            while(num>0){
                rem=num%10;
                sum= sum+(rem*rem*rem);
                num=num/10;
            }
            
             if(sum==temp){
                armstongnumbers[i]=temp;
            }
        }
        System.out.println("Armstrong number array:");
        for(int no:armstongnumbers){
            System.out.print(no+" ");
        }
    }
}