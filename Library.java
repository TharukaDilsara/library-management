import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have borrowed '" + book.getTitle() + "'.");
                    return;
                } else {
                    System.out.println("'" + book.getTitle() + "' is currently not available.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have returned '" + book.getTitle() + "'.");
                    return;
                } else {
                    System.out.println("'" + book.getTitle() + "' is not currently borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
}
