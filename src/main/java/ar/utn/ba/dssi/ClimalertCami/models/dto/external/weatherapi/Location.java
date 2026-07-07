package ar.utn.ba.dssi.ClimalertCami.models.dto.external.weatherapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String name;
    private String region;
    private String country;
}