package Homework;

class Book {
    private String name;
    private int year;
    private Author author;
    private double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
public class Library {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("Alex Ternovan", "alex.ternovan@fanduel.com");

        // Create a book
        Book book = new Book("The Nothingness", 2024, author, 99.98);

        // Print book details
        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " +
                book.getAuthor().getName() + ", published in " + book.getYear());
    }
}
