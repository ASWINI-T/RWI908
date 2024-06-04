package day11;

import java.util.ArrayList;
import java.util.List;

// Books class
class Books {
    private String title;
    private String author;

    // Constructor to initialize the title and author of the book
    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library1 class
class Library1 {
    private String name;
    private List<Books> books;  // The Library "owns" the books

    // Constructor to initialize the library's name and create an empty list of books
    public Library1(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBooks(String title, String author) {
        Books book = new Books(title, author);  // The Library creates and owns the Book objects
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Books book : books) {
            book.displayBookDetails();
        }
    }
}

// Main class
public class CompositionEx {
    public static void main(String[] args) {
        // Create a Library1 object
        Library1 library = new Library1("City Library");

        // Add books to the library
        library.addBooks("To Kill a Mockingbird", "Harper Lee");
        library.addBooks("1984", "George Orwell");
        library.addBooks("The Great Gatsby", "F. Scott Fitzgerald");

        // Display the books in the library
        library.displayBooks();

        // Note: We don't have direct references to Book objects here.
        // If the library is destroyed, its books are also destroyed.
    }
}

