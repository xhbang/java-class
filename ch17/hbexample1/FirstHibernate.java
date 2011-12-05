package lizhx;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class FirstHibernate {
public static void main(String[] args) {
// Configuration ������� Hibernate ����ѶϢ
Configuration config = new Configuration().configure();
// ���� config ���� SessionFactory
// SessionFactory �����ڽ��� Session
SessionFactory sessionFactory = config.buildSessionFactory();
//���־û������
User user = new User();
user.setName("JavaBoy");
user.setAge(new Integer(40));
//����Session���൱�ڿ���JDBC ��Connection
Session session = sessionFactory.openSession();
//Transaction ��ʾһ���DB �Ľ���
Transaction tx = session.beginTransaction();
//������ӳ�������ݿ����д���
session.save(user);
tx.commit();
session.close();
sessionFactory.close();
System.out.println("������¼�ɹ�,����MySQL�йۿ����!");
}
}