
package spinasantiago.practica3;


public class Jugador {
    
    // Atributos
    private String nombre;
    private String posicion;
    private double precioFichaje;
    
    // Constructores
    
    public Jugador(String nombre, String posicion, int precioFichaje){
        this.nombre = nombre;
        this.posicion = posicion;
        this.precioFichaje = precioFichaje;
    }
    
    // Metodos

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getPrecioFichaje() {
        return precioFichaje;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPrecioFichaje(double precioFichaje) {
        this.precioFichaje = precioFichaje;
    }

    // ToString
    @Override
    public String toString() {
        return "{" + nombre + ", " + posicion + ", " + precioFichaje + "}";
    }
    
    
    
    
    
    
    
    
    
    
}
