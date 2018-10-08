package list3_2_2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand_numbers= new Random();
		int number1= rand_numbers.nextInt(899) + 100;
		int number2= rand_numbers.nextInt(899) + 100;
		int number3= rand_numbers.nextInt(899) + 100;
		
		System.out.println(" first=" + number1 + "\n second=" + number2 + "\n third=" + number3);
		
		int numb1 = number1/100;
		int numb2 = number2/100;
		int numb3 = number3/100;
		
		int sum = numb1 + numb2 + numb3;
		System.out.println("Your sum is: " + sum);
	}

}
