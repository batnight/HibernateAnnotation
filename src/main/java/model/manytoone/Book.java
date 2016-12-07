package model.manytoone;

import javax.persistence.*;

/**
 * Created by Mohammad on 07/12/2016.
 */
@Entity
@Table(name = "tbl_books")
public class Book {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "library_id",foreignKey = @ForeignKey(name = "person_if_fk"))
    private Library library;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }


    public Book() {
    }

    public Book(String bookName, Library library) {
        this.bookName = bookName;
        this.library = library;
    }
}
