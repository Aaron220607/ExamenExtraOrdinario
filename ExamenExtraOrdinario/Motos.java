public class Motos extends Embarcacion{
   private int cv;
    private double litros;
    public Motos(int id, String nombre, int cv, double litros) throws CaballosException{
        super(id, nombre);
        if(cv<IDatos.MIN_CABALLOS || cv>IDatos.MAX_CABALLOS){
            throw new CaballosException("Los caballos deben estar entre "+IDatos.MIN_CABALLOS+" y "+IDatos.MAX_CABALLOS);
        }
        this.cv = cv;
        this.litros = litros;
    }
    public int getCv(){
        return cv;
    }
    public void setCv(int cv){
        this.cv = cv;
    }
    public double alquiler(){
        return (getPrecioBase()+cv) *IDatos.ALQUILER_MOTOS;
    }
    public String toString(){
        return super.toString()+" Motos [cv=" + cv + ", litros=" + litros + "]";
    }
}
