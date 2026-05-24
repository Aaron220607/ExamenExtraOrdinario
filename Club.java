public class Club {
    private String nombre;
    private Embarcacion[] embarcaciones;
    private  int nEmbarcaciones;
    public Club(String nombre){
        this.nombre =nombre;
        this.embarcaciones = new Embarcacion[IDatos.MAX_EMBARCACIONES];
        this.nEmbarcaciones=0;
    }
    public void addEmbarcacion(Embarcacion e){
        if(nEmbarcaciones<IDatos.MAX_EMBARCACIONES){
            embarcaciones[nEmbarcaciones]=e;
            nEmbarcaciones++;
        } else {
            System.out.println("No se pueden agregar mas embarcaciones");
        }
    }
    public int getNEmbarcaciones() {
        return nEmbarcaciones;
    }
}
