/*
 1. Develop a system to manage book details for a Library Management System.
 Scenario:
 Imagine you are developing a Library Management System for a university.
 The system needs to handle different types of books efficiently.
 (a) Create a class called Book with the title (String), author (String), ISBN
 (String), and price (double) as attributes.
 (b) Implement constructor overloading with the following variations:
 I. A constructor that initializes only title and author.
 II. A constructor that initializes title, author, and ISBN.
 III. A constructor that initializes all attributes (title, author, ISBN, and price).
 (c) Implement method overloading for a method named getBookDetails() with
 the following variations:
 I. No parameters → Returns all details of the book.
 II. One parameter (ISBN) → Returns details of the book with the given
 ISBN.
 (d) Create a main method and create objects using the above constructors. Call
 the getBookDetails methods and display the results
*/

public class book{
    private String title;
    private String Author;
    private String ISBN;
    private double Price;

    public book(String title,String Author){
        this.title=title;
        this.Author=Author;
        this.ISBN="N/A";
        this.Price=0;

    }
    public book(String title,String Author,String ISBN){
        this.title=title;
        this.Author=Author;
        this.ISBN=ISBN;
        this.Price=0;


    }
    public book(String title,String Author,String ISBN,double price){
        this.title=title;
        this.Author=Author;
        this.ISBN=ISBN;
        this.Price=price;
    }




    public String getBookDetails(){
        return "Title: "+this.title
        +"\nAuthor: "+this.Author
        +"\nISBN: "+this.ISBN
        +"\nPrice: "+this.Price;

    }
    public String getBookDetails(String inputISBN) {
        if (inputISBN.equals(this.ISBN)) {
            return getBookDetails();
        } else {
            return "No book found with ISBN: " + inputISBN;
        }
    }
}

class LibraryManagementSystem {

    public static void main(String[] args) {


        book b1 = new book("Atomic Habits", "John");
        book b2 = new book("Harry Potter", "Johnny", "81271982367");
        book b3 = new book("Java", "kumar", "29847932846", 1599.00);

        System.out.println( b1.getBookDetails());
        System.out.println();
        System.out.println( b2.getBookDetails());
        System.out.println();
        System.out.println( b3.getBookDetails());
        System.out.println();

        System.out.println( b3.getBookDetails("29847932846"));


    }
}
