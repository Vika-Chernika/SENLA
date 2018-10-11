package list3_2_2;

import java.util.ArrayList;
import list3_2_2.Generation;

public class Calculation {

	ArrayList<Integer> three_digitNumbers  = new ArrayList<Integer>();
	
	public void creatingArray (Generation gen) {
		
		int sumOfFirstDigits = 0;
		
		for (int i = 0; i<3; i++)	{
			three_digitNumbers.add(gen.randomNewValue());
			System.out.println("Number: " +three_digitNumbers.get(i));
		}
	
		for (int i = 0; i<3; i++)	{
			sumOfFirstDigits +=three_digitNumbers.get(i) / 100;
		}
		System.out.println("Sum of numbers: " + sumOfFirstDigits);
}
		
}
