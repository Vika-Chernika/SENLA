package list3_2_2;

import java.util.Random;

public class Generation {
	
	Random random = new Random();
	
	final int MIN_VALUE = 100;
	final int MAX_VALUE = 900;
	
	public int randomNewValue()
	{
		int newValue = random.nextInt(MAX_VALUE)+MIN_VALUE;
		return newValue ;
	}
}
