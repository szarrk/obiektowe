package calculator_project;
import java.lang.Math;


interface BasicMathOperations {
	double addition(double x, double y);
	double subtraction(double x, double y);
    double power(double x, double y);
    double root(double x) throws Exception;
    double average(double x, double y);
    double multiplication(double x, double y);
    double division(double x, double y) throws Exception;
}

public class Calculator implements BasicMathOperations {
	double calcResult = 0;
	
	double firstNumber;
    double secondNumber;
	
	//function for adding
    @Override
	public double addition(double firstNumber, double secondNumber) {
		double sum = firstNumber + secondNumber;
		return sum;
	}
	
	//function for subtraction
    @Override
	public double subtraction(double firstNumber, double secondNumber) {
		double sub = firstNumber - secondNumber;
		return sub;
	}
	
	//function for multiplying
    @Override
	public double multiplication(double firstNumber, double secondNumber) {
		double mul = firstNumber * secondNumber;
		return mul;
	}
	
	//function for division 
    @Override
	public double division(double firstNumber, double secondNumber) throws Exception {
		if (secondNumber == 0) {
            throw new Exception("It is impossible to divide by 0!");
            }
		return firstNumber / secondNumber;	
	}
	
	//function for power
    @Override
	public double power(double firstNumber, double secondNumber) {
		double power = Math.pow(firstNumber, secondNumber);
		return power;
	}
	
	//function for root
    @Override
	public double root(double firstNumber) throws Exception {
		
		if (firstNumber < 0) {
            throw new Exception("Negative roots do not exist in real numbers!");
            }
		return (Math.sqrt(firstNumber));
	}
	
	//function for average
    @Override
	public double average(double firstNumber, double secondNumber) {
		return ((firstNumber + secondNumber) /2.0);
	}
}
