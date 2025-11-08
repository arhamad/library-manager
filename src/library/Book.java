package library;

public class Book {
    private final String title;
    private final Author author;
    private final double price;

    public Book(String title, Author author, double price) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be empty");
        }
        if (author == null) {
            throw new IllegalArgumentException("Book must have an author");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.title = title.trim();
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("📘 %s | ✍️ %s | 💲%.2f",
                title, author.getName(), price);
    }
}
