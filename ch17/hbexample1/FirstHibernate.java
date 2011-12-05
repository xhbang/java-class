package lizhx;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class FirstHibernate {
public static void main(String[] args) {
// Configuration 负责管理 Hibernate 配置讯息
Configuration config = new Configuration().configure();
// 根据 config 建立 SessionFactory
// SessionFactory 将用于建立 Session
SessionFactory sessionFactory = config.buildSessionFactory();
//将持久化的物件
User user = new User();
user.setName("JavaBoy");
user.setAge(new Integer(40));
//开启Session，相当于开启JDBC 的Connection
Session session = sessionFactory.openSession();
//Transaction 表示一组对DB 的交易
Transaction tx = session.beginTransaction();
//将对象映像至数据库表格中储存
session.save(user);
tx.commit();
session.close();
sessionFactory.close();
System.out.println("新增记录成功,请在MySQL中观看结果!");
}
}