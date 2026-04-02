package weather;

public class WeatherTracker {
    String currentConditions;

    NotifierFactory factory;

    public WeatherTracker() {
        this.factory = new NotifierFactory();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        Notifier notifier = factory.createNotifier(weatherDescription);
        System.out.print(notifier.generateWeatherAlert(weatherDescription));
    }
}