package main;

public class Calculator {
	public String calculate(String[] numbers) {
		Integer sum = 0;
		for (String string : numbers) {
			sum += Integer.parseInt(string);
		}
		return sum.toString();
	}
}
