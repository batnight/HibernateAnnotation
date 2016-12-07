import model.manytomany.Course;
import model.manytoone.Book;
import model.manytoone.Library;
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
    public static void main(String[] args) {
        //createOneToMany();
        //createOneToOne();]
        //createManyToMany();

        createManyToOne();

    }

    private static void createManyToOne() {
        Library library1 = new Library("Library One");
        Library library2 = new Library("Library Two");

        create(new Book("book1",library1));
        create(new Book("book2",library1));
        create(new Book("book3",library1));

        create(new Book("book1",library2));
        create(new Book("book2",library2));
        create(new Book("book3",library2));
    }

    private static void createManyToMany() {
        List<Course> courses1 = new ArrayList<Course>();
        List<Course> courses2 = new ArrayList<Course>();

        courses1.add(new Course("ریاضی"));
        courses1.add(new Course("علوم"));
        courses1.add(new Course("هنر"));

        courses2.add(new Course("دینی"));
        courses2.add(new Course("هندسه"));
        courses2.add(new Course("شیمی"));

        create(new model.manytomany.Person("Mohammad Jalili", courses1));
        create(new model.manytomany.Person("Amir Jalili", courses2));
    }

    private static void createOneToOne() {
        create(new Person("Mohammad Jalili", new Phone("09214923885")));
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

    public static void create(Object object) {
        Session session = HibernateUtils.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        session.save("create Object", object);

        transaction.commit();

        session.close();
    }
}
