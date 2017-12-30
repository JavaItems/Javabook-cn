
abstract class A
{
	public final static String FLAG = "china";
	public String name = "sam";
	
	public String getName()
	{
		return name;	
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public abstract void print(); 
	
}


class B extends A{
	
	public void print()
	{
		System.out.println("国籍：" + super.FLAG);
		System.out.println("姓名：" + super.name);
		
	}
	
}


public class AbstractDemo01 
{
	public static void main(String args[])
	{
		// A a = new A();    //不能被直接实例化，因为有为实现的方法
		B b = new B();
		b.print();
	}
	
}



