package lizhx;
public class User {
private Integer id;
private String name;
private Integer age; 
// 必须要有一个预设的建构方法
// 以使得Hibernate 可以使用Constructor.newInstance()建立对象
public User() {}
public Integer getId() {return id;}
public void setId(Integer id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public Integer getAge() {return age;}
public void setAge(Integer age) {this.age = age;}
}