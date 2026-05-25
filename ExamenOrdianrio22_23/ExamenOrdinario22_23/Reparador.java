public class Reparador extends Trabajador{
private int piezasUsadas;
    public Reparador(String nombre){
        super(nombre);
        this.piezasUsadas = 0;
    }
    public String repararPuerta(Maletin maletin) throws TallerException{
        if(maletin.getTornillos()<PUERT_TORNILLOS || maletin.getClavos()<PUERT_CLAVOS){
            throw new TallerException("No hay suficientes piezas para reparar la puerta");
        }
        maletin.setTornillos(maletin.getTornillos()-PUERT_TORNILLOS);
        maletin.setClavos(maletin.getClavos()-PUERT_CLAVOS);
        piezasUsadas += PUERT_TORNILLOS + PUERT_CLAVOS;
        return "Puerta reparada por " + this.nombre;
    }
    public String repararVentana(Maletin maletin) throws TallerException{
        if(maletin.getTornillos()<VENT_TORNILLOS || maletin.getClavos()<VENT_CLAVOS){
            throw new TallerException("No hay suficientes piezas para reparar la ventana");
        }
        maletin.setTornillos(maletin.getTornillos()-VENT_TORNILLOS);
        maletin.setClavos(maletin.getClavos()-VENT_CLAVOS);
        piezasUsadas += VENT_TORNILLOS + VENT_CLAVOS;
        return "Ventana reparada por " + this.nombre;
    }
    public double calcularSalario(){
        return piezasUsadas * COBRO_REP;
    }
    public String toString(){
        return super.toString();
    }
    
}
