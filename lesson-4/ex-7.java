interface Forecast{
    int todaysTemperature(int tempFo);   
    final class FakeClass implements Forecast{
        @Override
        public int todaysTemperature(int tempFo){
            return 11;
        }
    }
}

class Weather{
    public final Forecast temperature;
    public Weather(Forecast tempWe){
        this.temperature = tempWe;
    }
    public int todaysWeather(){
        return (this.temperature.todaysTemperature(0));
    }
    String weatherInfo(){
        return("Temperature is " + todaysWeather());
    }
}

public class main {

	public static void main(String[] args) {
		Forecast forecast = new Forecast.FakeClass();
        Weather today = new Weather(forecast);
        String weatherToday = today.weatherInfo();
        System.out.println(weatherToday);
        assert "Temperature is 17".equals(weatherToday);
	}

}
