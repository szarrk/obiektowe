package calculator_project;

import java.util.Scanner;
import java.lang.Math;

public class Application {
	public static void main(String[] args) {
		Calculator my_calculator = new Calculator();
		calcUI encap = new calcUI(my_calculator);
		Calculator fake_calculator = new Calculator();
		fakeCalcUI fakeEncap = new fakeCalcUI(fake_calculator);
		fakeEncap.fakeTest();
		
		Scanner calcInput = new Scanner(System.in);
		while(true) {
			System.out.println("Please, enter your command:\n"
					+ "Possible operations: (add, sub, mul, div, power, square_root, avg, logarithm)\n"
					+ "Enter quit if you want to quit ");
			String command = calcInput.next();
			encap.takeCommand(command);
		}
	}
}



