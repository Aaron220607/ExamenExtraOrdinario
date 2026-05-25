public class Club implements IDatos{
    private String nombre;
    private Embarcacion[] embarcaciones;
    private  int nEmbarcaciones;
    public Club(String nombre){
        this.nombre =nombre;
        this.embarcaciones = new Embarcacion[IDatos.MAX_EMBARCACIONES];
        this.nEmbarcaciones=0;
    }
    public String addEmbarcacion(Embarcacion e){
        String mensaje = "";
        if(nEmbarcaciones<IDatos.MAX_EMBARCACIONES){
            embarcaciones[nEmbarcaciones]=e;
            nEmbarcaciones++;
            mensaje = "Embarcacion agregada correctamente";
        } else {
            mensaje = "No se pueden agregar mas embarcaciones";
        }
        return mensaje;
        }
    
    public int getNEmbarcaciones() {
        return nEmbarcaciones;
    }
}
