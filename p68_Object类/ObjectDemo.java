
class Student
{
	private String name;
	private int age;
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
}


public class ObjectDemo
{
	public static void main(String[] args)
	{
		Student stu = new Student("sam", 20);
		
		System.out.println(stu);
		System.out.println(stu.toString());
		
		
		
	}
	
	
}