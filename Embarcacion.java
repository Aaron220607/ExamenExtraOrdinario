abstract class Embarcacion {
protected int id;
protected String nombre;
protected int precioBase;
public Embarcacion(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    this.precioBase = IDatos.PRECIO_BASE;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    abstract double alquiler();
    public String toString() {
        return "Embarcacion [id=" + id + ", nombre=" + nombre + ", precioBase=" + precioBase + "]";
    }
}
