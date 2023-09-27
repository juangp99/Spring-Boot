package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosCancelacionConsulta(

    @NotNull
    Long idConsulta,

    Long idMedico,

    Long idPaciente,
    @NotNull
    LocalDateTime fecha,

    MotivoCancelacion motivo) {

}
