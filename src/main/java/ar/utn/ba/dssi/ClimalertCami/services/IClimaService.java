package ar.utn.ba.dssi.ClimalertCami.services;

import reactor.core.publisher.Mono;

public interface IClimaService {
    Mono<Void> actualizarClimaCiudades();
} 