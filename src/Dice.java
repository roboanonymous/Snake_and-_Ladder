import java.util.concurrent.ThreadLocalRandom;
public class Dice {

	int diceCount;
	int min =1;
	int max = 6;
	
	public Dice(int diceCount)
	{
		this.diceCount = diceCount;
	}
	public int rolldice()
	{
		int totalsum = 0;
		int diceused = 0;
		
		while(diceused < diceCount)
		{
			totalsum  += ThreadLocalRandom.current().nextInt(min, max+1);
			diceused++;
			
		}
		
		return totalsum;
	}
	
}
