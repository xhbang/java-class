package lizhx;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class ThreeHibernate {
    public static void main(String[] args) throws Exception {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(User.class);
        // ²éÑ¯user ËùÓÐ×Ö¶Î
        List users = criteria.list();

        User updated = null;
        for (ListIterator iterator = users.listIterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            if(updated == null)
                updated = user;
            System.out.println(user.getName() +
                                  "\n\tAge: " + user.getAge());
                                
        }
        updated.setName("JavaGirl");
        session.flush();
        users =  criteria.list();  
        session.close();
        sessionFactory.close();
        for (ListIterator iterator = users.listIterator(); iterator.hasNext(); ) {
               User user = (User) iterator.next();            
               System.out.println(user.getName() +
                                        "\n\tAge: " + user.getAge());
                                        
    }
  }
}
