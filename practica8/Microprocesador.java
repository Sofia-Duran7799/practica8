/**
 * Representa un microprocesador como componente electrónico especializado.
 * Hereda de {@link ComponenteElectronico} y añade características específicas
 * de rendimiento como memoria cache y velocidad de reloj.
 */
public class Microprocesador extends ComponenteElectronico {
    private final int cacheRAM;
    private final long velocidadHz;

    /**
     * Construye un microprocesador con especificaciones técnicas.
     * 
     * @param cacheRAM    Cantidad de memoria cache integrada en megabytes (MB)
     * @param velocidadHz Velocidad de reloj en hertzios (Hz). 
     *                    Para mejor legibilidad usar notación científica (ej: 3_200_000_000L para 3.2 GHz)
     */
    public Microprocesador(int cacheRAM, long velocidadHz) {
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    /**
     * @return La memoria cache integrada en megabytes (MB)
     */
    public int getCacheRAM() { 
        return cacheRAM; 
    }

    /**
     * @return La velocidad de reloj del microprocesador en hertzios (Hz).
     *         Para obtener el valor en GHz: {@code getVelocidadHz() / 1_000_000_000}
     */
    public long getVelocidadHz() { 
        return velocidadHz; 
    }

    /**
     * Devuelve una representación en cadena con las especificaciones técnicas.
     * 
     * @return Cadena en formato "Microprocesador{cacheRAM=X, velocidadHz=Y}"
     *         donde X es el valor en MB e Y la velocidad en Hz
     */
    @Override
    public String toString() {
        return "Microprocesador{" +
                "cacheRAM=" + cacheRAM +
                ", velocidadHz=" + velocidadHz +
                '}';
    }
}