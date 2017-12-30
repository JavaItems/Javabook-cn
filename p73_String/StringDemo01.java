

public class StringDemo01
{
	public static void main(String args[])
	{
		String s1 = "ChenZhanWei";
		String s2 = "ChenZhanWei";
		
		String s3 = new String("ChenZhanWei");
		String s4 = new String("ChenZhanWei");
		
		// == 比较
		System.out.println("s1 == s2 ->" + (s1 == s2));
		System.out.println("s3 == s4 ->" + (s3 == s4));
		System.out.println("s1 == s3 ->" + (s1 == s3));
		
		//String的内容比较
		System.out.println("s1 equals s2 ->" + (s1.equals(s2)));
		System.out.println("s3 equals s4 ->" + (s3.equals(s4)));
		System.out.println("s1 equals s3 ->" + (s1.equals(s3)));
		
		
		
	}	
	
	
}