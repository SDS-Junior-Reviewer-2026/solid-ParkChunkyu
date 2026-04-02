package weather;

import java.util.Objects;

public class NotifierFactory {

    Notifier createNotifier(String weatherDescription){
        if (Objects.equals(weatherDescription, "rainy")) {
            return new Phone();
        }
        else if (Objects.equals(weatherDescription, "sunny")) {
            return new Email();
        }
        else {
            return new Phone();
        }
    }
}
