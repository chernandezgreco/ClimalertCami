package ar.utn.ba.dssi.ClimalertCami.models.repositories;

import ar.utn.ba.dssi.ClimalertCami.models.entities.Clima;
import java.util.List;
import java.util.Optional;

public interface IClimaRepository {
    Clima save(Clima clima);
    List<Clima> findAll();
    Optional<Clima> findById(Long id);
    Optional<Clima> findByCiudad(String ciudad);
    List<Clima> findByProcesado(boolean procesado);
    void delete(Clima clima);
} 