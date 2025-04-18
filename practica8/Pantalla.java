/**
 * Representa una pantalla como componente electrónico especializado.
 * Hereda de {@link ComponenteElectronico} y añade características de resolución.
 */
public class Pantalla extends ComponenteElectronico {
    private final int resolucionX;
    private final int resolucionY;

    /**
     * Construye una pantalla con resolución específica.
     * 
     * @param resolucionX Resolución horizontal en píxeles (ancho)
     * @param resolucionY Resolución vertical en píxeles (alto)
     * @throws IllegalArgumentException Si los valores de resolución no son positivos
     */
    public Pantalla(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    /**
     * @return La resolución horizontal en píxeles (eje X)
     */
    public int getResolucionX() { 
        return resolucionX; 
    }

    /**
     * @return La resolución vertical en píxeles (eje Y)
     */
    public int getResolucionY() { 
        return resolucionY; 
    }

    /**
     * Devuelve una representación en cadena con la resolución de la pantalla.
     * 
     * @return Cadena en formato "Pantalla{resolucionX=X, resolucionY=Y}"
     *         donde X es el ancho en píxeles e Y el alto en píxeles
     */
    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                '}';
    }
}