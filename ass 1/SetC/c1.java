
public class c1{
    public static void main(String args[]){
      
        String str="Vaibhavi";
        int[] frequency =new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            frequency[ch]++;
        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                System.out.println((char)i+":"+frequency[i]);
            }
        }
    }
}