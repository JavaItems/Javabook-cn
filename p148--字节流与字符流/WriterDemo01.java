import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo01
{
	public static void main(String args[]) throws Exception
	{
		File f = new File("d:" + File.separator + "kj.txt");
		Writer out = new FileWriter(f,true);
		String str = "\r\ncomputer engineering dept";
		out.write(str);
		out.flush();   //Ë¢ÐÂ»º³åÇø
		//out.close()
	}	
	
}