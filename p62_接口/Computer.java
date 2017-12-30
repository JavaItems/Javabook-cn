interface VideoCard
{
	void display();
	String getName();
}


class Dmeng implements VideoCard
{
	private String name;
	Dmeng()
	{
		this.name = "Dmeng's videoCard";
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void display()
	{
			System.out.println("vidoe card working!");
	}
} 


class Mainboard
{
	private String CPU;
	VideoCard vc;
	public String getCPU()
	{
		return this.CPU;
	}
	public void setCPU(String CPU)
	{
		this.CPU = CPU;
	}
	
	public VideoCard getVc()
	{
		return this.vc;
	}	
	
	public void setVc(VideoCard vc)
	{
		this.vc = vc;
	}
	
	public void run()
	{
		System.out.println(CPU);
		System.out.println(vc.getName());
		vc.display();
		System.out.println("Mainboards running!");
	}
	
}


public class Computer
{
	public static void main(String[] args)
	{
		Dmeng dm = new Dmeng();
		Mainboard mb = new Mainboard();
		mb.setCPU("intel");
		mb.setVc(dm);
		mb.run();
	}
	
}