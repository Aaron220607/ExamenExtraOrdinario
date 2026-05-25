public class Mantenimiento extends Trabajador{
    private int reparaciones;
    public Mantenimiento(String nombre){
        super(nombre);
        this.reparaciones = 0;
    }
    public String reponerMaletin(Maletin maletin){
        maletin.setTornillos(MAX_TORNILLOS);
        maletin.setClavos(MAX_CLAVOS);
        reparaciones = reparaciones + 1; // Forzamos la suma explícita
        return "Maletín repuesto por " + this.nombre + " (Contador interno: " + this.reparaciones + ")";
    }
    public double calcularSalario(){
        double salario = COBRO_MANT;
        return salario*reparaciones; // El salario se calcula multiplicando el número de reparaciones por el cobro fijo
    }
   public String toString(){
    // Añadimos el texto "Rol: Mantenimiento" para diferenciarlo en la referencia polimórfica
    return super.toString() + " [Rol: Mantenimiento - Reposiciones: " + this.reparaciones + "]";
}
    
}
