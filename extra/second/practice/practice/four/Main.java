package extra.second.practice.practice.four;

//4)Create a library of books , Count the number of books added in the library. All the books have a common supplier "Mr XYZ"
//Show the details of library as:
//Supplier name:
//Total books:
//Book details

public class Main {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("Java Basics", "Mr ABC", 399.99);
        Book book2 = new Book("Spring Boot Guide", "Mark", 499.50);
        Book book3 = new Book("Data Structures", "Robert", 299.00);

        // Print library summary
        System.out.println("Supplier Name: " + Book.supplierName);
        System.out.println("Total Books  : " + Book.totalBooks);
        System.out.println("\nBook Details:");

        // Display details of each book
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}