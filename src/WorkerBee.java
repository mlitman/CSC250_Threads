
public class WorkerBee extends Thread
{
	private String name;
	
	public WorkerBee(String name)
	{
		int b = 5;
		this.name = name;
	}
	
	@Override
	public void run() 
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(this.name + " : " + i);
		}
		
	}
}
