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
}
