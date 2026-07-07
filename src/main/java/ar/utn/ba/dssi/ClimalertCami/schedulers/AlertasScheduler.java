package ar.utn.ba.dssi.ClimalertCami.schedulers;

import ar.utn.ba.dssi.ClimalertCami.services.IAlertasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AlertasScheduler {
    private static final Logger logger = LoggerFactory.getLogger(AlertasScheduler.class);
    private final IAlertasService alertasService;

    public AlertasScheduler(IAlertasService alertasService) {
        this.alertasService = alertasService;
    }

    @Scheduled(fixedRate = 60000)
    public void procesarAlertas() {
        alertasService.generarAlertasYAvisar()
                .doOnSuccess(v -> logger.info("Procesamiento de alertas completado"))
                .doOnError(e -> logger.error("Error en el procesamiento de alertas: {}", e.getMessage()))
                .subscribe();
    }
}
