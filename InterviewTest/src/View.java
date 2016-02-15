
public class View {
	
	public void display()
	{
		
		System.out.println("Text a massage ");
		int x=0;
		while(x<10)
		{
			
			System.out.println(x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			x++; 
			
			if(x>=10)
			{
				System.out.println("where running out ");
			}
		}
		
		
	}
	public void outOfTime()
	{
		System.out.println("dada");
	}

	

}
