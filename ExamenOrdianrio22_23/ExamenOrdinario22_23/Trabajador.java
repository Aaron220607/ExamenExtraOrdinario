abstract class Trabajador implements ITaller {
    protected String nombre;
    public Trabajador(String nombre){
        this.nombre = nombre;
    }
    abstract double calcularSalario();
    public String getNombre() {
        return nombre;
    }
    public String ToString(){
        return "Nombre del trabajador " + nombre;
    }
}
