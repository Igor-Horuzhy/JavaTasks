package model;

import java.util.List;

/**
 * Игорь
 * 8/2/2017.
 */
public class Library {

    private Integer id;
    private String book;
    private String author;


    public Library() {
    }

    public Library(Integer id, String book, String author) {
        this.id = id;
        this.book = book;
        this.author = author;
    }

    public Library(String book, String author) {
        this.book = book;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", book='" + book + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
