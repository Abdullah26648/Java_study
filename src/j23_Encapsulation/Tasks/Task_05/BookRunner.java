package j23_Encapsulation.Tasks.Task_05;

import java.util.Scanner;

public class BookRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();

        Book book = new Book(bookName, authorName);

        System.out.println("Book name is " + book.getBookName() + " and Author is " + book.getAuthorName());
    }
}