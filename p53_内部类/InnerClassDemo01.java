class Outer 
{
	int temp = 10;
	String author = "sam";
	class Inner
	{
		int temp = 20; 
		public void showOuter()
		{
			System.out.println("author  外部类的author: " + author);
			System.out.println("Outer.this.author  外部类的author: " + Outer.this.author);
			System.out.println("this.temp  内部类的temp: " + this.temp);
			System.out.println("Outer.this.temp  外部类的temp: " + Outer.this.temp);
		}
		
	}
	
	public void showInner()
	{
		Inner in = new Inner();
		in.showOuter();
	}

}

public class InnerClassDemo01
{
	static public void main(String[] args)
	{
		Outer out = new Outer();
		out.showInner();
	}
	
}