public class thiskeyword{
    public int id;
    public String name;
    thiskeyword(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("ID :"+id+"\n"+"NAME : "+name);
    }
    public static void main(String args[]){
        thiskeyword p=new thiskeyword(1,"Vaibhavi");
        p.display();
    }
}