/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.HashMap;



/**
 *
 * @author student
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


public class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f);
    put("GBP", 0.87063f);
    put("CHF", 0.9881f);
    put("JPY", 145.12f);
  }};


  public float euroToRate(String currency) {
    return this.rates.get(currency);
  }

  public FakeCantor() {
  }

}

 interface Currency {
  Currency addedCurrency(float value, String currency);

  Currency subtractedCurrency(float value, String currency);

  String abbreviation();

  String symbol();

  String balance();

  float toDollarExchangeRate();
}

class Euro implements Currency {
    private String currencyAbbreviation;
    private String currencySymbol;
    private float euroBalance;
    FakeCantor rates = new FakeCantor();
    
    public Euro (String abbreviation, String symbol, float balance){
        this.currencyAbbreviation = abbreviation;
        this.currencySymbol = symbol;
        this.euroBalance = balance;
    } 
    
    public Euro (String abbreviation, String symbol){
        this(abbreviation, symbol, 0);
    }
    
    @Override
    public Currency addedCurrency(float value, String currency) {
        float exchangingRate = rates;
        
    }
           
    @Override
    public String abbreviation(){return currencyAbbreviation;}
    
    @Override
    public String symbol() {return currencySymbol;}
    
    
    @Override
    public String balance() {return Float.toString(euroBalance);}
    
    @Override
    public Currency subtractedCurrency(float value, String currency){
        return null;
    }
    
    
}
            
    
                
}
    