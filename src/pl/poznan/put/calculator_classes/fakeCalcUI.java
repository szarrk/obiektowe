package calculator_project;

public class fakeCalcUI {
	private Calculator fakeEncapsulatedCalculator;
	public fakeCalcUI(Calculator fakeEncapsulatedCalculator) {
			this.fakeEncapsulatedCalculator =  fakeEncapsulatedCalculator;
		}

	Calculator calculator = new Calculator();
    double firstNumber = 10.0;
    double secondNumber = 20.0;

    public void calcUI(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
}
    
    // Test addition    
    public void fakeAddition() {
        double expected = 30.0;     
        double actual = fakeEncapsulatedCalculator.addition(firstNumber, secondNumber);
        if (expected != actual) {
            System.out.println("addition() does not return expected value");}
        else {
            	System.out.println("Addition is working correctly");
            }
    	}

    // Test subtraction
	public void fakeSubtraction() {
	    double expected = -10.0;     
	    double actual = fakeEncapsulatedCalculator.subtraction(firstNumber, secondNumber);
	    if (expected != actual) {
	        System.out.println("subtraction() does not return expected value");}
	    else {
	        	System.out.println("Subtraction is working correctly");
	        }
	}
	
    // Test multiplication
	    public void fakeMultiplication() {
		    double expected = 200.0;     
		    double actual = fakeEncapsulatedCalculator.multiplication(firstNumber, secondNumber);
		    if (expected != actual) {
		        System.out.println("multiplication() does not return expected value");}
		    else {
		        	System.out.println("Multiplication is working correctly");
		        }
	    }
	    
    // Test division
	    public void fakeDivision() {
	    try {	
		    double expected = 0.5;     
		    double actual = fakeEncapsulatedCalculator.division(firstNumber, secondNumber);
		    if (expected != actual) {
		        System.out.println("division() does not return expected value");}
		    else {
		        	System.out.println("Division is working correctly");
		        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e);
	    }
	    }

    // Test power
	    public void fakePower() {
		    double expected = 1.0E20;     
		    double actual = fakeEncapsulatedCalculator.power(firstNumber,secondNumber);
		    if (expected != actual) {
		        System.out.println("power() does not return expected value");}
		    else {
		        	System.out.println("Power is working correctly");
		        }
	    }
	    
    // Test root
	    public void fakeRoot() {
	    try {	
		    double expected = 3.1622776601683795;     
		    double actual = fakeEncapsulatedCalculator.root(firstNumber);
		    if (expected != actual) {
		        System.out.println("root() does not return expected value");}
		    else {
		        	System.out.println("Root is working correctly");
		        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e);
	    }
	    }	    
	    
    // Test average    
	    public void fakeAverage() {
		    double expected = 15.0;     
		    double actual = fakeEncapsulatedCalculator.average(firstNumber, secondNumber);
		    if (expected != actual) {
		        System.out.println("average() does not return expected value");}
		    else {
		        	System.out.println("Average is working correctly");
		        }
	    }
	    
	// Test logarithm
	    public void fakeLogarithm() {
	    	double expected = 1.301029995663981;
	    	Logarithm newLogarithm = new Logarithm(firstNumber, secondNumber);
		    double logarithmResult;
		    try{
		    	logarithmResult = newLogarithm.doubleValue();
		    	if (expected != logarithmResult) {
		        System.out.println("logarithm() does not return expected value");}
		    	else {
		        	System.out.println("Logarithm is working correctly");
		        }
		        }catch(Exception e){
		        System.out.println("Error: " + e);
		        }
		    }
	    
	public void fakeTest() {
		fakeAddition();
		fakeSubtraction();
		fakeMultiplication();
		fakeDivision();
		fakePower();
		fakeRoot();
		fakeAverage();
		fakeLogarithm();
	}

}	

