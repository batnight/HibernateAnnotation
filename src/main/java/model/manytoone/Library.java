package model.manytoone;

import javax.persistence.*;

@Entity
@Table(name = "tbl_library")
public class Library {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "library_name")
    private String libraryName;

    public Library() {
    }

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
