package model.onetomany;

import javax.persistence.*;

/**
 * Created by Mohammad on 06/12/2016.
 */
@Entity
@Table(name = "tbl_city")
public class City {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "city_name")
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City() {
    }
}
