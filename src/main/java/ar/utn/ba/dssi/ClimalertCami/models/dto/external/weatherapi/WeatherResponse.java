package ar.utn.ba.dssi.ClimalertCami.models.dto.external.weatherapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
    private Location location;
    private Current current;
} 