// ClassMTest.java
class FamilyMember{      // �����Ա
static private String surname="��";    // ���������surname
private String givenname;                // ����ʵ������givenname
static String getSurname() {             // �෽��
return surname;
}
static void changeSurname(String surname) // �෽��
{
//this.surname=surname;                    // this����ʹ��
FamilyMember.surname=surname;
}
FamilyMember(String givenname)             //���췽��
{
this.givenname=givenname;
}
FamilyMember()                              //û�в����ķ���
{
givenname="С��";
}
public String whatIsYourName()
{
return(surname+givenname); //������Ҳ����ʹ�ü����������������
}
}

public class ClassMTest {
public static void main(String args[]) {
System.out.println(FamilyMember.getSurname());//ͨ�����������෽��
FamilyMember a=new FamilyMember("�ϴ�");
System.out.println(a.getSurname()); //ͨ������ʵ�������෽����
System.out.println(a.whatIsYourName());
//������ǹ��еģ���ʹ�ڴ�����ʵ��֮��ı����������ʵ��Ҳ��֪��
FamilyMember.changeSurname("��");
System.out.println(a.whatIsYourName());
}
}