import java.util




public class ClassDemo04 
{

	public static void main(String[] args)
	{



		Student s1 = new Student("郭靖", 23);
		Student s2 = new Student("郭靖", 23);
		if(s1.compare(s2))
		{
			System.out.println("是同一个学生");
		} else {
			System.out.println("不是同一个学生");
		}
	}	
}


class Student
{
	private String name;
	private int age;
	
	public Student()
	{
		System.out.println("一个新的student对象被实例化");
	}
	
	public Student(String name, int age)
	{
		this();  				//调用student类的无参构造函数，必须放在第一行
		this.name = name;		//表示本类中的属性
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
	
	public boolean compare(Student stu)	//调用此方法时存在两个对象：当前对象，传入的对象stu
	{
		Student s1 = this;				//表示当前调用方法的对象
		Student s2 = stu;
		
		// if( s1 == s2)					//首先比较两个地址是否相等
		// {
			// return true;
		// }
		// else
			// return false; 		//结果：不是同一个学生
		
		//分别判断每一个属性是否相等	
		if( s1.name.equals(s2.name) && s1.age == s2.age )
		{
			return true;
		}
		else
			return false;     //结果：是同一个学生
	}
	
	public void getStuInfo()
	{
		System.out.println("姓名:" + this.getName() + "年龄：" + this.getAge());
	}
	
}
