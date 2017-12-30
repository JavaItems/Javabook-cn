import java.io.IOException;

public class RuntimeDemo01
{
	public static void main(String args[])
	{
		Runtime run = Runtime.getRuntime();
		System.out.println("JVM max memory:" + run.maxMemory());
		System.out.println("JVM free memory:" + run.freeMemory());
		String s = "zknu.edu.cn";
		for(int i = 0; i < 1000; i++)
		{
			s += i; //循环修改s，产生多个垃圾，会占用内存
		}
		System.out.println("JVM free memory afer recycle:" + run.freeMemory());
		run.gc();  //垃圾回收，释放空间
		System.out.println("JVM free memory afer gc:" + run.freeMemory());
		Process pro = null; //声明一个process对象，接收启动的进程
		try {
			pro = run.exec("calc.exe");  //调用本机程序
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);		//让此线程存活五秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pro.destroy(); //结束此线程
				
		
	}	
}