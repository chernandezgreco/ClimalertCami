package ar.utn.ba.dssi.ClimalertCami.services;

import ar.utn.ba.dssi.ClimalertCami.models.entities.Email;
import java.util.List;

public interface IEmailService {
    Email crearEmail(Email email);
    List<Email> obtenerEmails(Boolean pendiente);
    void procesarPendientes();
    void loguearEmailsPendientes();
}
