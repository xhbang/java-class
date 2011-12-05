package lizhx;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class FourHibernate {
    public static void main(String[] args) throws HibernateException {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();     
        Criteria criteria = session.createCriteria(User.class);
        // ��ѯuser �����ֶ�
        List users = criteria.list();      
         User updated = null;
        for (ListIterator iterator = users.listIterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            if(updated == null)
                updated = user;
            System.out.println(user.getName() +
                                      "\n\tAge: " + user.getAge());
             }
        // ʹ�ú�ɾ����֮�󴢴�
        session.delete(updated); 
        criteria = session.createCriteria(User.class);
        // ��ѯuser �����ֶ�
        users = criteria.list(); 
        // �ر����Session            
        session.close();
        for (ListIterator iterator = users.listIterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            if(updated == null)
                updated = user;
            System.out.println(user.getName() +
                                      "\n\tAge: " + user.getAge());
             
   }
 }
}