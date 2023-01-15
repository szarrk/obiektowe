interface Forecast{
    int todaysTemperature(int tempFo);   
    final class FakeClass implements Forecast{
        @Override
        public int todaysTemperature(int tempFo){
            return 17;
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
    void weatherInfo(){
        System.out.println("Temperature is " + todaysWeather());
    }
}

class App {
    public static void main(String[] args) {
        Forecast forecast = new Forecast.FakeClass();
        Weather today = new Weather(forecast);
        today.weatherInfo();
    }
}
