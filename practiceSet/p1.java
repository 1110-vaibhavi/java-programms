import java.util.Scanner;
public class p1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String:");
        String original=sc.nextLine();
        String reversed="";
        int length=original.length();
        for(int i=length-1 ;i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Its not a Palindrome");
        }
    }
}