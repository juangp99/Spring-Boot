package med.voll.api.domain.paciente;

import med.voll.api.domain.direccion.Direccion;

public record DatosDetalladoPaciente(Long id, String nombre, String email, String telefono, String documentoIdentidad, Direccion direccion) {

    public DatosDetalladoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getDocumentoIdentidad(), paciente.getDireccion());
    }
}
