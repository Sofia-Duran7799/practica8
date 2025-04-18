/**
 * Representa un componente electrónico que puede formar parte de un dispositivo.
 * Mantiene una relación bidireccional con el dispositivo al que pertenece.
 */
public class ComponenteElectronico {
    private DispositivoElectronico esParteDe;

    /**
     * Obtiene el dispositivo al que está asociado este componente.
     * 
     * @return Referencia al dispositivo electrónico que contiene este componente,
     *         o {@code null} si no está asociado a ningún dispositivo.
     */
    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    /**
     * Establece o elimina la asociación con un dispositivo electrónico.
     * <p>
     * Nota: Este método normalmente debería ser llamado automáticamente por los métodos
     * {@code agregarComponente()} o {@code quitarComponente()} de {@link DispositivoElectronico}
     * para mantener la consistencia bidireccional.
     * 
     * @param dispositivo Dispositivo al que se asociará el componente,
     *                    o {@code null} para eliminar la asociación existente.
     */
    public void setEsParteDe(DispositivoElectronico dispositivo) {
        this.esParteDe = dispositivo;
    }

    /**
     * Devuelve una representación en cadena que muestra el nombre del dispositivo asociado.
     * 
     * @return Cadena en formato "ComponenteElectronico{esParteDe=NombreDelDispositivo}",
     *         o "ComponenteElectronico{esParteDe=Ninguno}" si no está asociado a ningún dispositivo.
     */
    @Override
    public String toString() {
        return "ComponenteElectronico{" +
                "esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "Ninguno") +
                '}';
    }
}