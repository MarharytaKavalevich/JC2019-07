package lesson10;

import java.util.Objects;

public class Book {

    private int id;
    private String title;
    private String lastNameOfTheAuthor;
    private String firstNameOfTheAuthor;
    private String middleNameOfTheAuthor;

    public Book(int id, String title, String lastNameOfTheAuthor, String firstNameOfTheAuthor, String middleNameOfTheAuthor) {
        this.id = id;
        this.title = title;
        this.lastNameOfTheAuthor = lastNameOfTheAuthor;
        this.firstNameOfTheAuthor = firstNameOfTheAuthor;
        this.middleNameOfTheAuthor = middleNameOfTheAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastNameOfTheAuthor() {
        return lastNameOfTheAuthor;
    }

    public void setLastNameOfTheAuthor(String lastNameOfTheAuthor) {
        this.lastNameOfTheAuthor = lastNameOfTheAuthor;
    }

    public String getFirstNameOfTheAuthor() {
        return firstNameOfTheAuthor;
    }

    public void setFirstNameOfTheAuthor(String firstNameOfTheAuthor) {
        this.firstNameOfTheAuthor = firstNameOfTheAuthor;
    }

    public String getMiddleNameOfTheAuthor() {
        return middleNameOfTheAuthor;
    }

    public void setMiddleNameOfTheAuthor(String middleNameOfTheAuthor) {
        this.middleNameOfTheAuthor = middleNameOfTheAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(lastNameOfTheAuthor, book.lastNameOfTheAuthor) &&
                Objects.equals(firstNameOfTheAuthor, book.firstNameOfTheAuthor) &&
                Objects.equals(middleNameOfTheAuthor, book.middleNameOfTheAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, lastNameOfTheAuthor, firstNameOfTheAuthor, middleNameOfTheAuthor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", lastNameOfTheAuthor='" + lastNameOfTheAuthor + '\'' +
                ", firstNameOfTheAuthor='" + firstNameOfTheAuthor + '\'' +
                ", middleNameOfTheAuthor='" + middleNameOfTheAuthor + '\'' +
                '}';
    }
}