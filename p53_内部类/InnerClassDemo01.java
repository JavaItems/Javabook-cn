class Outer 
{
	int temp = 10;
	String author = "sam";
	class Inner
	{
		int temp = 20; 
		public void showOuter()
		{
			System.out.println("author  �ⲿ���author: " + author);
			System.out.println("Outer.this.author  �ⲿ���author: " + Outer.this.author);
			System.out.println("this.temp  �ڲ����temp: " + this.temp);
			System.out.println("Outer.this.temp  �ⲿ���temp: " + Outer.this.temp);
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