package list3_2_2;

import list3_2_2.Generator;
import list3_2_2.Calculator;;


public class Main {

	public static void main(String[] args) {

		Generator genc = new Generator();
		Calculator calc = new Calculator();

		calc.createArray(genc);
		System.out.println("Sum of numbers: " + calc.calcFirstDigits());
	}
}
