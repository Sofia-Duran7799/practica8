/**
 * Representa un smartphone como computadora móvil especializada.
 * Hereda de {@link Computadora} e incorpora componentes específicos como sensor biométrico y pantalla táctil.
 * <p>
 * Modela dispositivos móviles modernos con capacidades avanzadas de autenticación y visualización.
 * </p>
 */
public class Smartphone extends Computadora {
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;

    /**
     * Construye un smartphone con todos sus componentes esenciales.
     * 
     * @param fabricante       Fabricante del dispositivo (heredado)
     * @param numeroSerie      Número de serie único (heredado)
     * @param marca            Marca comercial (heredado)
     * @param nombre           Modelo específico (heredado)
     * @param costo            Valor en decimal del dispositivo (heredado)
     * @param cpu              Microprocesador principal (heredado)
     * @param ramMB            Memoria RAM en megabytes (heredado)
     * @param sensorDeHuella   Sensor biométrico de autenticación (no puede ser nulo)
     * @param pantalla         Componente de pantalla táctil (no puede ser nulo)
     * @throws IllegalArgumentException Si el sensor o la pantalla son {@code null}
     */
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo,
                      Microprocesador cpu, long ramMB, Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo, cpu, ramMB);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
        agregarComponente(sensorDeHuella);
        agregarComponente(pantalla);
    }

    /**
     * Obtiene el sensor biométrico integrado en el dispositivo.
     * 
     * @return {@link Sensor} especializado en reconocimiento de huella digital
     */
    public Sensor getSensorDeHuella() { 
        return sensorDeHuella; 
    }

    /**
     * Obtiene la pantalla táctil del smartphone.
     * 
     * @return {@link Pantalla} con características específicas para uso móvil
     */
    public Pantalla getPantalla() { 
        return pantalla; 
    }

    /**
     * Devuelve una representación completa que incluye:
     * - Atributos heredados de la computadora
     * - Especificaciones del sensor biométrico
     * - Detalles de la pantalla integrada
     * 
     * @return Cadena con formato: Smartphone{..., sensorDeHuella=X, pantalla=Y}
     */
    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString() +
                ", sensorDeHuella=" + sensorDeHuella +
                ", pantalla=" + pantalla +
                '}';
    }
}
