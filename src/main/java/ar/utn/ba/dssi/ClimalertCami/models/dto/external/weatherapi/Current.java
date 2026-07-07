package ar.utn.ba.dssi.ClimalertCami.models.dto.external.weatherapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    private double temp_c;
    private double temp_f;
    private Condition condition;
    private double wind_kph;
    private int humidity;
} 