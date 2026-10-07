import java.util.Scanner;
class bookinventory{
    private String title;
    private String author;
    private int quantity;
    public bookinventory(String title, String author,int quantity){
        this.title=title;
        this.author=author;
        this.quantity=quantity;
    }
    public String getTitle(){
        return title;
    }
    public int getQuantity(){
        return quantity;
    }
    public void displayBookDetails(){
        System.out.println("\n---Book Inventory record---");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Available Quantity: "+quantity+" copies");
    }
}
public class book{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of books (n)");
        int n=s.nextInt();
        bookinventory[] book=new bookinventory[n];
        for(int i=0;i<n;i++){
            System.out.println("\n Enter details of Book #"+(i+1)+":");
            System.out.println("Enter Title: ");
            String title= s.nextLine();
            System.out.println("Enter Author: ");
            String author= s.nextLine();
            System.out.println("Enter Quantity:");
            int quantity=s.nextInt();
           
            book[i] =new bookinventory(title,author,quantity);
        }
        System.out.println("\n Enter the title of the book to check its available quantity:");
        String searchTitle=s.nextLine();
        boolean found=false;
        for(bookinventory b:book){
            if (b.getTitle().equalsIgnoreCase(searchTitle)){
                b.displayBookDetails();
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("book with title "+searchTitle+"was not found in the inventory.");
        }
        s.close();
    }
}