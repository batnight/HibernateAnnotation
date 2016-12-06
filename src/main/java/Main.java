import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class Main {
    public static void main(String [] args){

    }

    public static void create(Object object){
        Session session = HibernateUtils.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        session.save("create Object", object);

        transaction.commit();

        session.close();
    }
}
