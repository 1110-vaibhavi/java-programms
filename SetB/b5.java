public class b5{
    public static void main(String []args){
        int rows =4;
        int val=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val=(val==1)?0:1;
            }
            System.out.println();
        }
    }
}