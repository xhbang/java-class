package lizhx;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class FourHibernate {
    public static void main(String[] args) throws HibernateException {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();     
        Criteria criteria = session.createCriteria(User.class);
        // 查询user 所有字段
        List users = criteria.list();      
         User updated = null;
        for (ListIterator iterator = users.listIterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            if(updated == null)
                updated = user;
            System.out.println(user.getName() +
                                      "\n\tAge: " + user.getAge());
             }
        // 使用后删除，之后储存
        session.delete(updated); 
        criteria = session.createCriteria(User.class);
        // 查询user 所有字段
        users = criteria.list(); 
        // 关闭这个Session            
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