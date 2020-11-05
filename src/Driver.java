//is executing in Main Thread
public class Driver 
{
	public static void main(String[] args) 
	{
		WorkerBee wb1 = new WorkerBee("WB1");
		WorkerBee wb2 = new WorkerBee("WB2");
		WorkerBee wb3 = new WorkerBee("WB3");
		
		wb1.start(); //this does NOT BLOCK the next line
		wb2.start();
		wb3.start();
		
		System.out.println("******************** " + Thread.activeCount() + "***************");
		try
		{
			wb1.join();
			wb2.join();
			wb3.join();
			
			//what if I don't want the code below to execute until all 3 threads above are done
			for(int i = 0; i < 1000; i++)
			{
				System.out.println("WOOT");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
