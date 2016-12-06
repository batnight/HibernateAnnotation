import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class HibernateUtils {
    private static StandardServiceRegistry registry = null;
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getInstance() {
        try {
            registry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return sessionFactory;
        }
    }

    private HibernateUtils() {
    }
}
