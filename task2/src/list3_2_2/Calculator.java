package list3_2_2;

import java.util.ArrayList;
import list3_2_2.Generator;

public class Calculator {

	ArrayList<Integer> threeDigitNumbers  = new ArrayList<Integer>();
	
	public void createArray (Generator gen) {
				
		for (int i = 0; i < 3; i++)	{
			threeDigitNumbers.add(gen.randomNewValue());
			System.out.println("Number: " + threeDigitNumbers.get(i));
		}
	}	
	
	public int calcFirstDigits () {
		
		int sumOfFirstDigits = 0;
		
			for (int i = 0; i<3; i++){
				sumOfFirstDigits +=threeDigitNumbers.get(i) / 100;
			}
			
		return sumOfFirstDigits;
	}
}	
