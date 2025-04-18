/**
 * Representa un televisor como dispositivo electrónico de consumo especializado.
 * Hereda de {@link DispositivoElectronicoDeConsumo} e incorpora obligatoriamente una {@link Pantalla}.
 */
public class Television extends DispositivoElectronicoDeConsumo {
    private final Pantalla pantalla;

    /**
     * Construye un televisor con todos sus atributos y componente de pantalla.
     * 
     * @param fabricante   Fabricante del televisor (heredado)
     * @param numeroSerie  Número de serie único (heredado)
     * @param marca        Marca comercial (heredado)
     * @param nombre       Modelo específico (heredado)
     * @param costo        Valor en decimal del dispositivo (heredado)
     * @param pantalla     Componente de pantalla integrado (no puede ser nulo)
     * @throws IllegalArgumentException Si la pantalla es {@code null}
     */
    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
        agregarComponente(pantalla);
    }

    /**
     * Obtiene el componente de pantalla integrado en el televisor.
     * 
     * @return La {@link Pantalla} asociada al dispositivo (siempre presente)
     */
    public Pantalla getPantalla() { 
        return pantalla; 
    }

    /**
     * Devuelve una representación completa del televisor incluyendo:
     * - Atributos heredados del dispositivo base
     * - Estado de encendido
     * - Especificaciones de la pantalla integrada
     * 
     * @return Cadena con formato: Television{..., pantalla=X} donde X son los detalles de la pantalla
     */
    @Override
    public String toString() {
        return "Television{" +
                super.toString() +
                ", pantalla=" + pantalla +
                '}';
    }
}
