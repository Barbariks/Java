import Task1.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(2001, "Harry", "Black");
        book.PrintName();
        book.setName("Wolf");
    }
}