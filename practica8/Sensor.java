/**
 * Representa un sensor electrónico especializado que hereda de {@link ComponenteElectronico}.
 * Capaz de medir y reportar valores específicos según su tipo y unidad de medida configurada.
 */
public class Sensor extends ComponenteElectronico {
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;

    /**
     * Construye un sensor con configuración específica.
     * 
     * @param tipo           Tipo de sensor (ej: "temperatura", "movimiento", "luz")
     * @param unidadDeMedida Unidad de medida (ej: "°C", "lux", "m/s²")
     * @param valor          Valor actual de la medición en unidades enteras
     * @throws IllegalArgumentException Si el valor es negativo y no corresponde al tipo de sensor
     */
    public Sensor(String tipo, String unidadDeMedida, int valor) {
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    /**
     * @return Categoría funcional del sensor (ej: ambiental, mecánico, óptico)
     */
    public String getTipo() { 
        return tipo; 
    }

    /**
     * @return Unidad de medida utilizada para las lecturas del sensor
     */
    public String getUnidadDeMedida() { 
        return unidadDeMedida; 
    }

    /**
     * @return Valor actual medido por el sensor en formato numérico entero.
     *         Para conversión a unidades reales usar la unidadDeMedida correspondiente
     */
    public int getValor() { 
        return valor; 
    }

    /**
     * Devuelve una representación en cadena con el estado completo del sensor.
     * 
     * @return Cadena en formato: Sensor{tipo='X', unidadDeMedida='Y', valor=Z}
     *         donde X es el tipo, Y la unidad y Z el valor numérico
     */
    @Override
    public String toString() {
        return "Sensor{" +
                "tipo='" + tipo + '\'' +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", valor=" + valor +
                '}';
    }
}