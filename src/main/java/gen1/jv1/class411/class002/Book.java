package gen1.jv1.class411.class002;

import java.util.ArrayList;
import java.util.List;

// Clase principal Book con clase interna Publisher
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private BookStatus status;
    private Publisher publisher;
    private List<Chapter> chapters;

    public Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.status = BookStatus.AVAILABLE;
        this.chapters = new ArrayList<>();
    }

    // Clase interna no estática - representa el editor del libro
    public class Publisher {
        private String name;
        private String country;

        public Publisher(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public String getInfo() {
            return "Publisher: " + name + " (" + country + ") - Book: " + Book.this.title;
        }
    }

    // Clase interna estática - representa un capítulo
    public static class Chapter {
        private int number;
        private String title;
        private int startPage;

        public Chapter(int number, String title, int startPage) {
            this.number = number;
            this.title = title;
            this.startPage = startPage;
        }

        public String getInfo() {
            return "Chapter " + number + ": " + title + " (page " + startPage + ")";
        }
    }

    public void setPublisher(String name, String country) {
        this.publisher = new Publisher(name, country);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void addChapter(int number, String title, int startPage) {
        chapters.add(new Chapter(number, title, startPage));
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                ", status=" + status.getDescription() +
                '}';
    }
}
