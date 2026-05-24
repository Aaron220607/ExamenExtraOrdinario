public class Piraguas extends Embarcacion {
    private int nOcupantes;

    public Piraguas(int id, String nombre, int precioBase, int nOcupantes) {
        super(id, nombre, precioBase);
        this.nOcupantes = nOcupantes;
        
    }
public double alquiler() {
        return precioBase + (nOcupantes );
    }
public String toString() {
        return "Piraguas [nOcupantes=" + nOcupantes + ", id=" + id + ", nombre=" + nombre + ", precioBase="
                + precioBase + "]";
    }
} 
