package lizhx;
public class User {
private Integer id;
private String name;
private Integer age; 
// ����Ҫ��һ��Ԥ��Ľ�������
// ��ʹ��Hibernate ����ʹ��Constructor.newInstance()��������
public User() {}
public Integer getId() {return id;}
public void setId(Integer id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public Integer getAge() {return age;}
public void setAge(Integer age) {this.age = age;}
}