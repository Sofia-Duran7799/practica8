/**
 * Representa una computadora como dispositivo electrónico de consumo especializado.
 * Hereda de {@link DispositivoElectronicoDeConsumo} y gestiona componentes específicos
 * como microprocesador y memoria RAM.
 */
public class Computadora extends DispositivoElectronicoDeConsumo {
    private Microprocesador cpu;
    private long ramMB;

    /**
     * Construye una computadora con sus componentes esenciales.
     * 
     * @param fabricante   Fabricante del dispositivo (heredado)
     * @param numeroSerie  Número de serie único (heredado)
     * @param marca        Marca comercial (heredado)
     * @param nombre       Modelo específico (heredado)
     * @param costo        Valor en decimal del dispositivo (heredado)
     * @param cpu          Microprocesador principal (no puede ser nulo)
     * @param ramMB        Capacidad de memoria RAM en megabytes (MB)
     * @throws IllegalArgumentException Si el microprocesador es {@code null} o la RAM es negativa
     */
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, Microprocesador cpu, long ramMB) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
        agregarComponente(cpu);
    }

    /**
     * Obtiene el microprocesador principal de la computadora.
     * 
     * @return {@link Microprocesador} actual instalado
     */
    public Microprocesador getCpu() { 
        return cpu; 
    }

    /**
     * Reemplaza el microprocesador y actualiza los componentes del dispositivo.
     * 
     * @param cpu Nuevo microprocesador (no puede ser {@code null})
     */
    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
        agregarComponente(cpu);
    }

    /**
     * @return Capacidad actual de memoria RAM en megabytes (MB)
     */
    public long getRamMB() { 
        return ramMB; 
    }

    /**
     * Establece nueva capacidad de memoria RAM.
     * 
     * @param ramMB Nueva capacidad en megabytes (debe ser valor positivo)
     */
    public void setRamMB(long ramMB) { 
        this.ramMB = ramMB; 
    }

    /**
     * Devuelve una representación completa que incluye:
     * - Atributos heredados del dispositivo base
     * - Estado de encendido
     * - Especificaciones del microprocesador
     * - Capacidad de memoria RAM
     * 
     * @return Cadena con formato: Computadora{..., cpu=X, ramMB=Y}
     */
    @Override
    public String toString() {
        return "Computadora{" +
                super.toString() +
                ", cpu=" + cpu +
                ", ramMB=" + ramMB +
                '}';
    }
}