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
			s += i; //ѭ���޸�s�����������������ռ���ڴ�
		}
		System.out.println("JVM free memory afer recycle:" + run.freeMemory());
		run.gc();  //�������գ��ͷſռ�
		System.out.println("JVM free memory afer gc:" + run.freeMemory());
		Process pro = null; //����һ��process���󣬽��������Ľ���
		try {
			pro = run.exec("calc.exe");  //���ñ�������
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);		//�ô��̴߳������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pro.destroy(); //�������߳�
				
		
	}	
}