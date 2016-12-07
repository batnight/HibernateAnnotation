package model.onetomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "country_name")
    private String countryName;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<City> cities;

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, List<City> cities) {
        this.countryName = countryName;
        this.cities = cities;
    }

    public Country() {
    }
}
