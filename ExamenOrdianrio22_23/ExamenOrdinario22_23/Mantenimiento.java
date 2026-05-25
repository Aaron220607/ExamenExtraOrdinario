public class Mantenimiento extends Trabajador{
    private int reparaciones;
    public Mantenimiento(String nombre){
        super(nombre);
        this.reparaciones = 0;
    }
    public String reponerMaletin(Maletin maletin){
        maletin.setTornillos(MAX_TORNILLOS);
        maletin.setClavos(MAX_CLAVOS);
        this.reparaciones++;
        return "Maletín repuesto por " + this.nombre;
    }
    public double calcularSalario(){
        double salario = COBRO_MANT;
        return salario*this.reparaciones;
    }
    public String toString(){
        return super.toString();
    }
    
}
