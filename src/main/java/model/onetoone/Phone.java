package model.onetoone;

import javax.persistence.*;

/**
 * Created by Mohammad on 06/12/2016.
 */
@Entity
@Table(name = "tbl_phone")
public class Phone {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "phone_number")
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }
}
