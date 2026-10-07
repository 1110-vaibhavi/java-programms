public class b3{
    public static void main(String args[]){
        String names[]={"vaibhavi","kajal","hindavi"};
        String find="hindavi";
        int length=names.length;
        for(int i=0;i<length;i++){
            if(names[i]==find){
                System.out.println("At index:"+i);
                break;
            }
        }
    }
}