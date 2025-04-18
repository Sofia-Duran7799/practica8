import java.util.ArrayList;

/**
 * Representa un dispositivo electrónico que puede estar compuesto por múltiples componentes.
 * Incluye información básica como fabricante, número de serie, marca, nombre y costo,
 * además de permitir gestionar una lista de componentes asociados.
 */
public class DispositivoElectronico {
    private final String fabricante;
    private final String numeroSerie;
    private final String marca;
    private final String nombre;
    private float costo;
    private ArrayList<ComponenteElectronico> componentes;

    /**
     * Constructor para inicializar un dispositivo electrónico con sus propiedades básicas.
     * 
     * @param fabricante   Fabricante del dispositivo (no puede ser modificado).
     * @param numeroSerie  Número de serie único del dispositivo (no puede ser modificado).
     * @param marca        Marca comercial del dispositivo (no puede ser modificado).
     * @param nombre       Nombre/modelo del dispositivo (no puede ser modificado).
     * @param costo        Costo inicial del dispositivo en decimal.
     */
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
    }

    /**
     * @return El fabricante del dispositivo.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @return El número de serie del dispositivo.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @return La marca comercial del dispositivo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return El nombre/modelo del dispositivo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return El costo actual del dispositivo.
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Establece un nuevo costo para el dispositivo.
     * 
     * @param costo Nuevo valor del costo en decimal.
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * @return Lista de componentes electrónicos asociados al dispositivo.
     */
    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }

    /**
     * Añade un componente al dispositivo y actualiza la referencia del componente
     * para indicar que pertenece a este dispositivo.
     * 
     * @param componente Componente electrónico a agregar.
     */
    public void agregarComponente(ComponenteElectronico componente) {
        componentes.add(componente);
        componente.setEsParteDe(this);
    }

    /**
     * Elimina un componente del dispositivo y actualiza la referencia del componente
     * para indicar que ya no pertenece a este dispositivo.
     * 
     * @param componente Componente electrónico a eliminar.
     */
    public void quitarComponente(ComponenteElectronico componente) {
        componentes.remove(componente);
        componente.setEsParteDe(null);
    }

    /**
     * @return Una representación en cadena del dispositivo con todos sus atributos,
     *         incluyendo la lista de componentes asociados.
     */
    @Override
    public String toString() {
        return "DispositivoElectronico{" +
                "fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", componentes=" + componentes +
                '}';
    }
}