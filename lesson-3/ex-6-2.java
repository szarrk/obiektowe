interface Number {
    public double doubleValue() throws Exception;
}

class Logarithm implements Number {

  private double base, argument;

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

public class Oop6{

    public static void main(String[] args) {
        
        Logarithm newLogarithm = new Logarithm(2, 2);
        double result;
        try{
            result = newLogarithm.doubleValue();
        }catch(Exception e){
            System.out.println("Error: " + e);
            return;
        }
        System.out.println(result);
    }
}
