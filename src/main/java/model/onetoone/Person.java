package model.onetoone;

import javax.persistence.*;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_id")
    private Phone phone;

    public Person(String fullName, Phone phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    public Person() {
    }

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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
