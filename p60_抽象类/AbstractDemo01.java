
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
		System.out.println("������" + super.FLAG);
		System.out.println("������" + super.name);
		
	}
	
}


public class AbstractDemo01 
{
	public static void main(String args[])
	{
		// A a = new A();    //���ܱ�ֱ��ʵ��������Ϊ��Ϊʵ�ֵķ���
		B b = new B();
		b.print();
	}
	
}



