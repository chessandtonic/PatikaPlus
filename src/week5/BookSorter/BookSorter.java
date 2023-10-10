package week5.BookSorter;

import java.util.TreeSet;
import java.util.Comparator;

public class BookSorter {
    public static void main(String[] args) {
        // Set of books sorted by name
        TreeSet<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Java Programming", 350, "John Doe", "2021-01-15"));
        bookSetByName.add(new Book("Data Structures", 500, "Alice Johnson", "2020-05-20"));
        bookSetByName.add(new Book("Algorithms", 450, "Bob Smith", "2019-11-10"));
        bookSetByName.add(new Book("Design Patterns", 380, "Eva Lee", "2022-03-05"));
        bookSetByName.add(new Book("Introduction to Java", 300, "Michael Brown", "2018-09-30"));

        System.out.println("Books sorted by name:");
        System.out.println();
        for (Book book : bookSetByName) {
            System.out.println(book);
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        // Set of books sorted by page count
        TreeSet<Book> bookSetByPageCount = new TreeSet<>((book1, book2) -> Integer.compare(book1.getPageCount(), book2.getPageCount()));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nBooks sorted by page count:");
        System.out.println();
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}