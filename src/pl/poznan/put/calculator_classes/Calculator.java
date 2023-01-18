package calculator_project;
import java.lang.Math;

public class Calculator {
	boolean quitCalc = false;
	double calcResult = 0;
	
	double firstNumber;
    double secondNumber;
	
	boolean quit () {
		quitCalc = true;
		return quitCalc;
	}
	
	//function for adding
	public double add(double firstNumber, double secondNumber) {
		double sum = firstNumber + secondNumber;
		return sum;
	}
	
	//function for subtraction
	public double sub(double firstNumber, double secondNumber) {
		double subtraction = firstNumber - secondNumber;
		return subtraction;
	}
	
	//function for multiplying
	public double mul(double firstNumber, double secondNumber) {
		double multiplication = firstNumber * secondNumber;
		return multiplication;
	}
	
	//function for division 
	public double div(double firstNumber, double secondNumber) throws Exception {
		if (secondNumber == 0) {
            throw new Exception("It is impossible to divide by 0!");
            }
		return firstNumber / secondNumber;	
	}
	
	//function for power
	public double power(double firstNumber, double secondNumber) {
		double power = Math.pow(firstNumber, secondNumber);
		return power;
	}
	
	//function for root
	public double root(double firstNumber) throws Exception {
		
		if (firstNumber < 0) {
            throw new Exception("Negative roots do not exist in real numbers!");
            }
		return (Math.sqrt(firstNumber));
	}
	
	//function for avg
	public double average(double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber /2.0);
	}
}
