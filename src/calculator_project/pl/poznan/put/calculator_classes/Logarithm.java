package calculator_project;

interface Number {
    public double doubleValue() throws Exception;
}

public class Logarithm implements Number {

  private double base, argument;
  boolean quitCalc = false;

  @Override
  public double doubleValue() throws Exception {
      
        if ((base < 0) || (base == 1) || (argument < 0)) {
            throw new Exception("Wrong base or wrong argument");
        }
        return Math.log(this.argument) / Math.log(this.base);
 }

  public Logarithm(double inputBase, double inputArgument) {
    this.base = inputBase;
    this.argument = inputArgument;
  }
}
