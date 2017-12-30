
public class ExtDemo03 
{
	static public void main(String args[])
	{
		Santana s = new Santana("red");
		s.print();
		
	}
	
}


class Car
{
	String color;
	Car(String color)
	{
		this.color = color;
		
	}
	
}


class Santana extends Car
{
	private String color;
	public Santana(String color)
	{
		super(color);
		
	}
	public void print()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
	
	
}
