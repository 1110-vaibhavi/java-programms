import java.util.Scanner;
public class a5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int length=str.length();
        for(int i=0;i<=length;i++){
            if(str.charAt(i)=='a'){
                System.out.println("Vowels are:"+str.charAt(i));
            }else if(str.charAt(i)=='e'){
                System.out.println("Vowels are:"+str.charAt(i));
            }else if(str.charAt(i)=='i'){
                 System.out.println("Vowels are:"+str.charAt(i));
            }else if(str.charAt(i)=='o'){
                 System.out.println("Vowels are:"+str.charAt(i));
        }else if(str.charAt(i)=='u'){
                 System.out.println("Vowels are:"+str.charAt(i));
    }
}
 }
}