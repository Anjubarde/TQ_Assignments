package extra.second.practice.practice.four;

class Book {
    static String supplierName = "Mr XYZ";
    static int totalBooks = 0;

    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    // Method to display individual book details
    void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println("-------------------------");
    }
}