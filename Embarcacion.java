abstract class Embarcacion {
protected int id;
protected String nombre;
protected int precioBase;
public Embarcacion(int id, String nombre, int precioBase) {
    this.id = id;
    this.nombre = nombre;
    this.precioBase = precioBase;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    abstract double alquiler();
}
