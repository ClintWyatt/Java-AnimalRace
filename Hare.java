public class Hare
{
	private StringBuilder HareLetter;
	private int hareNum;
	
	public Hare()
	{
		HareLetter = new StringBuilder();
		hareNum =0;
	}
	public void incrementDistance(int x)
	{
		hareNum =x; 
		if(hareNum < 1){ hareNum =1;}
	}
	public void setDistance()
	{
			
		HareLetter.setLength(0); //resetting the hare letter
		
		//HareLetter.setLength(0); //resetting the hare letter
		for(int i =0; i < hareNum; i++)	
		{	
			HareLetter.append('H');
		}
		print();	
	}
	private void print()
	{
		System.out.println(HareLetter);
	}
}
