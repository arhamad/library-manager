package library;

public class Author {
    private final String name;
    private final String email;

    public Author(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Author name cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.name = name.trim();
        this.email = email.trim();
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, email);
    }
}
