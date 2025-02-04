package Assignment10;

public class Book {
    static String libraryName="Central Library";
    String title;
    String author;
    final int isbn;


    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Book Title Name : " + title);
            System.out.println("Author Name : " + author);
            System.out.println("Book ID :" + isbn);

        } else {
            System.out.println("Invalid account object!!");
        }


    }

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public static void main(String[] args) {
        Book ob1= new Book("Good One", "K.M Mathur", 45);
        Book ob2 = new Book("Bad One", "V.K. Sinha", 98);

        displayLibraryName();
        ob1.displayDetails();

    }
}