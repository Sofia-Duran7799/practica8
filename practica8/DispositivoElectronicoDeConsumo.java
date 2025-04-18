/**
 * Representa un dispositivo electrónico de consumo con capacidad de gestión de estado de encendido.
 * Hereda de {@link DispositivoElectronico} y añade funcionalidad básica de control de energía.
 * 
 * <p>Esta clase es adecuada para modelar dispositivos que requieren un estado de encendido/apagado
 * como electrodomésticos, equipos informáticos o dispositivos móviles.</p>
 */
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    private boolean encendido;

    /**
     * Construye un dispositivo electrónico de consumo apagado por defecto.
     * 
     * @param fabricante   Fabricante del dispositivo (heredado)
     * @param numeroSerie  Número de serie único (heredado)
     * @param marca        Marca comercial (heredado)
     * @param nombre       Nombre/modelo (heredado)
     * @param costo        Costo inicial en decimal (heredado)
     */
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = false;
    }

    /**
     * Enciende el dispositivo, estableciendo su estado de energía a activado.
     * No tiene efecto si el dispositivo ya está encendido.
     */
    public void encender() { 
        encendido = true; 
    }

    /**
     * Apaga el dispositivo, estableciendo su estado de energía a desactivado.
     * No tiene efecto si el dispositivo ya está apagado.
     */
    public void apagar() { 
        encendido = false; 
    }

    /**
     * Verifica el estado actual de energía del dispositivo.
     * 
     * @return {@code true} si el dispositivo está encendido,
     *         {@code false} si está apagado
     */
    public boolean isEncendido() { 
        return encendido; 
    }

    /**
     * Devuelve una representación en cadena que incluye los atributos heredados
     * más el estado actual de energía.
     * 
     * @return Cadena con formato: "DispositivoElectronico{...}, encendido=X"
     *         donde X es el estado booleano de encendido
     */
    @Override
    public String toString() {
        return super.toString() + ", encendido=" + encendido;
    }
}