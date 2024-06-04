package day11;


import java.util.ArrayList;
import java.util.List;

 class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
 // Method to display book details
    void displayBookDetails() {
        System.out.println("- " + title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println(name + " has the following books:");
        for (Book book : books) {
            System.out.println("- " + book.title + " by " + book.author);
        }
    }
}

public class AggregationEx {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("Harry poter" , "Rowling");
        Book book2 = new Book("Chef", "james");
        Book book3 = new Book("The Great woman", "abcd");
        
        // Display books independently of any library
        System.out.println("Books created independently of any library:");
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
        
//        // Create library
//        Library library = new Library("City Library");
//
//        // Add books to library
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//
//        // Display books in library
//        library.displayBooks();
    }
}



