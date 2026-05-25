abstract class Trabajador implements ITaller {
    protected String nombre;
    public Trabajador(String nombre){
        this.nombre = nombre;
    }
    public abstract double calcularSalario();
    public String getNombre() {
        return nombre;
    }
    public String toString(){
        return "Nombre del trabajador " + nombre;
    }
}
