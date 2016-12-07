import model.onetomany.City;
import model.onetomany.Country;
import model.onetoone.Person;
import model.onetoone.Phone;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class Main {
    public static void main(String [] args){
        //createOneToMany();
        createOneToOne();


    }

    private static void createOneToOne() {
        create(new Person("Mohammad Jalili",new Phone("09214923885")));
    }

    private static void createOneToMany() {
        Country country = new Country();
        List<City> cities = new ArrayList<City>();
        cities.add(new City("Tehran"));
        cities.add(new City("Tabriz"));
        cities.add(new City("Shiraz"));
        country.setCities(cities);
        country.setCountryName("iran");

        create(country);
    }

    public static void create(Object object){
        Session session = HibernateUtils.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        session.save("create Object", object);

        transaction.commit();

        session.close();
    }
}
