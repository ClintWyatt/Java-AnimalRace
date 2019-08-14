import java.util.Random;


public class race
{
	public static void main(String[] args)
	{
	
	Random Rand = new Random(); //creating a object for the random integers
	//setting local varaibels
	int torLocation =1;
	int hareLocation =1;
	int random1;
	int random2;
	int counter =0;
	//creating tortise and hare objets
	Hare hare = new Hare();
	Tortise tor = new Tortise();
	while(torLocation < 65 && hareLocation < 65)
	{
		random1 = Rand.nextInt(6);
		random2 = Rand.nextInt(6);
		if(random1 == 4) {random1 = -2;}
		else if(random1 == 5) {random1 = -1;}

		if(random2 == 4) {random2 = -2;}
		else if(random2 == 5) {random2 = -1;}


		torLocation +=random1;
		hareLocation +=random2; 
		if(torLocation < 0){ torLocation =0;}		
		if(hareLocation <0) {hareLocation =0;}
		hare.incrementDistance(hareLocation);
		tor.incrementDistance(torLocation);
		//System.out.printf("Tortise Location %d Hare Location %d \n", torLocation, hareLocation);
		if(counter % 5 ==0)
		{
			System.out.printf("Status after turn %d \n", counter);
			hare.setDistance();
			tor.setDistance();	
		}
		counter++;
	}
	hare.setDistance();
	tor.setDistance();
	if(torLocation == hareLocation)
	{
		System.out.println("It's a tie!");
	}
	else if(torLocation > hareLocation)
	{
		System.out.println("The Tortise wins!");
	}
	else if(hareLocation > torLocation)
	{
		System.out.println("The Hare wins!");
	}
	System.out.printf("Final score: tortise %d, hare %d \n", torLocation, hareLocation);
}
} 
