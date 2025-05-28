// Book class definition
class Book {
    String title;
    String author;
    String publisher;
    double price;
    int year;

    // Constructor
    Book(String title, String author, String publisher, double price, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    // Display method
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
        System.out.println("Year: " + year);
    }
}

// BookSales class definition
class BookSales {
    String sellerName;
    int numberOfSales;
    int sellerId;

    // Constructor
    BookSales(String sellerName, int numberOfSales, int sellerId) {
        this.sellerName = sellerName;
        this.numberOfSales = numberOfSales;
        this.sellerId = sellerId;
    }

    // Display method
    void display() {
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Seller ID: " + sellerId);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "Alice", "TechBooks", 499.99, 2022);
        BookSales sales = new BookSales("Bob", 150, 101);

        System.out.println("Book Information:");
        book.display();
        System.out.println("\nSales Information:");
        sales.display();
    }
}
