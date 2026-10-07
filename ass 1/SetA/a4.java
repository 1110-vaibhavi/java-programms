public class a4{
    public static void main(String args[]){
        int length=args.length;
        for(int i=0;i<=length;i++){
            if((Integer.parseInt(args[i])%2)==0){
                System.out.println("Even numbers from args array:"+Integer.parseInt(args[i]));
            }
        }
    }
}
