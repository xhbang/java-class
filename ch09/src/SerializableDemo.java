import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo
{

	public static void main(String args[]) throws Exception
	{
		Student stu = new Student(20051064, "zhang shan", 20, "CQUCS");
		FileOutputStream fout = new FileOutputStream("data1.ser");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		// 输出对象
		oout.writeObject(stu);
		oout.close();
		stu = null;
		FileInputStream fin = new FileInputStream("data1.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
		// 读入对象
		stu = (Student) oin.readObject();
		oin.close();
		System.out.println("学生信息：");
		System.out.println("ID：        " + stu.id);
		System.out.println("name：      " + stu.name);
		System.out.println("age：       " + stu.age);
		System.out.println("department：" + stu.department);
	}
}

class Student implements Serializable
{

	private static final long serialVersionUID = 1L;

	int id;

	String name;

	int age;

	String department;

	public Student(int id, String name, int age, String department)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.writeUTF(name);
		out.writeUTF(department);
		out.writeInt(id);
		out.writeInt(age);
	}

	private void readObject(ObjectInputStream in) throws IOException
	{
		name = in.readUTF();
		department = in.readUTF();
		id = in.readInt();
		age = in.readInt();
	}

}