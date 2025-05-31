package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeatherResponse {
    private Current current;

    @Data
    public class Current {
        private int temperature;

        @JsonProperty("weather_descriptions")
        private List<String> weatherDescription;

        private int feelslike;

    }

}
