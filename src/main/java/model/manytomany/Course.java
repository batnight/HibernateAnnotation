package model.manytomany;

import javax.persistence.*;

/**
 * Created by Mohammad on 06/12/2016.
 */
@Entity
@Table(name = "tbl_course")
public class Course {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "course_name")
    private String courseName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }
}
