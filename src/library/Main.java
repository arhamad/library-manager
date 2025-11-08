package library;
public class Main {
    public static void main(String[] args) {
        Author rowling = new Author("J.K. Rowling", "jkrowling@gmail.com");
        Author martin = new Author("George R.R. Martin", "grrm@gmail.com");

        Book book1 = new Book("Harry Potter", rowling, 29.99);
        Book book2 = new Book("Game of Thrones", martin, 34.50);

        System.out.println(book1);
        System.out.println(book2);
    }
}