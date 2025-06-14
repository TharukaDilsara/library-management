import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Creating some book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        Book book2 = new Book("1984", "George Orwell", "978-0-452-28423-4");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.viewBooks();
                    break;
                case 2:
                    System.out.print("Enter the ISBN of the book you want to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;
                case 3:
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 4:
                    System.out.println("Thank you for using this system.Have a good day!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
