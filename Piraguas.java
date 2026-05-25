public class Piraguas extends Embarcacion {
    private int nOcupantes;

    public Piraguas(int id, String nombre, int nOcupantes) {
        super(id, nombre);
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
