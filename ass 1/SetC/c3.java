public class c3{
    public static void main(String[] args){
        int[] array1={1,2,4,5,6,2};
        int[] array2={2,3,5,7,8,5};
        int[] temp=new int[array1.length + array2.length];
        int count=0;
        for(int i=0;i<array1.length;i++){
            boolean isduplicate=false;
            for(int j=0;j<count;j++){
                isduplicate=true;
                break;
            }
        
        if(!isduplicate){
            temp[count]=array1[i];
            count++;
        }
        }
        for(int i=0;i<array2.length;i++){
            boolean isduplicate=false;
            for(int j=0;j<count;j++){
                if(temp[j]==array2[i]){
                    isduplicate=true;
                    break;
                }
            }
        
        if(!isduplicate){
            temp[count]=array2[i];
            count++;
        }
        }
        System.out.println("Union result:");
        for(int i=0;i<count;i++){
            System.out.println(temp[i]+" ");
        }
        System.out.println();
    }
}