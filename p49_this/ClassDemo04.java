import java.util




public class ClassDemo04 
{

	public static void main(String[] args)
	{



		Student s1 = new Student("����", 23);
		Student s2 = new Student("����", 23);
		if(s1.compare(s2))
		{
			System.out.println("��ͬһ��ѧ��");
		} else {
			System.out.println("����ͬһ��ѧ��");
		}
	}	
}


class Student
{
	private String name;
	private int age;
	
	public Student()
	{
		System.out.println("һ���µ�student����ʵ����");
	}
	
	public Student(String name, int age)
	{
		this();  				//����student����޲ι��캯����������ڵ�һ��
		this.name = name;		//��ʾ�����е�����
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean compare(Student stu)	//���ô˷���ʱ�����������󣺵�ǰ���󣬴���Ķ���stu
	{
		Student s1 = this;				//��ʾ��ǰ���÷����Ķ���
		Student s2 = stu;
		
		// if( s1 == s2)					//���ȱȽ�������ַ�Ƿ����
		// {
			// return true;
		// }
		// else
			// return false; 		//���������ͬһ��ѧ��
		
		//�ֱ��ж�ÿһ�������Ƿ����	
		if( s1.name.equals(s2.name) && s1.age == s2.age )
		{
			return true;
		}
		else
			return false;     //�������ͬһ��ѧ��
	}
	
	public void getStuInfo()
	{
		System.out.println("����:" + this.getName() + "���䣺" + this.getAge());
	}
	
}
