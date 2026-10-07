public class sumofdigit{
    public static int sumofDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofDigit(n/10);
    }
    public static void main(String args[]){
        int num=9021;
        System.out.println("the sum of digit is :"+sumofDigit(num));
    }
}