public class Tortise
{
	private StringBuilder Torletters;
	private int torNum;
	
	public Tortise()
	{
		Torletters = new StringBuilder(); //creating the string builder object
		torNum =0;
	}
	public void incrementDistance(int x)
	{
		torNum = x;
		if(torNum < 1){torNum =1;}
	}
	public void setDistance()
	{
	
		Torletters.setLength(0); //resetting the entire string
			
		for(int i =0; i < torNum; i++)
		{	
			Torletters.append('T');
		}
		
		print();
		
	}
	private void print()
	{
		System.out.println(Torletters);
	}
}
