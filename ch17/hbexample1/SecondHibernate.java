package lizhx;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
import java.util.Iterator;
import java.util.List;
public class SecondHibernate {
public static void main(String[] args) {
Configuration config = new Configuration().configure();
SessionFactory sessionFactory = config.buildSessionFactory();
Session session = sessionFactory.openSession();
Criteria criteria = session.createCriteria(User.class);
// 查询user 所有字段
List users = criteria.list();
Iterator iterator = users.iterator();
System.out.println("id \t name \t       age");
while (iterator.hasNext()) {
User user = (User) iterator.next();
System.out.println(user.getId() + " \t " + user.getName() + "\t" +
user.getAge());
}
// 查询user 中符合条件的字段
criteria.add(Expression.eq("name", "JavaBoy"));
users = criteria.list();
iterator = users.iterator();
System.out.println("id \t name \t       age");
while (iterator.hasNext()) {
User user = (User) iterator.next();
System.out.println(user.getId() + " \t " + user.getName() + "\t" +
user.getAge());
}
session.close();
sessionFactory.close();
}
}
