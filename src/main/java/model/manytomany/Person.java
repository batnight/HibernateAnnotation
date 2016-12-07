package model.manytomany;

import model.onetoone.Phone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 06/12/2016.
 */
@Entity
@Table(name = "tbl_person")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(table = "tbl_person_course", name = "ids")
    private List<Course> courses = new ArrayList<Course>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person() {
    }
}
