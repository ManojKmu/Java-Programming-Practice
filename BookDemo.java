class Book{
String name;
int price;
void print()
{
    System.out.println("Book name is: "+name);
    System.out.println("Book price is: "+price);
}
}
public class BookDemo {
    public static void main(String[] args) {
        Book b=new Book();
        b.name="Java";
        b.price=240;
        b.print();
    }
}
