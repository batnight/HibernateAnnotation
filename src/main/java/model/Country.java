package model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "tbl_country_name")
    private String countryName;


}
