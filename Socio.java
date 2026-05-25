public class Socio implements IDatos{
    private int nSocio; 
    private Reserva[] reservas;
    private int nReservas;
    public Socio(int nSocio){
        this.nSocio = nSocio;
        this.reservas = new Reserva[IDatos.MAX_RESERVAS];
        this.nReservas=0;
    }
    public String addReserva(Reserva r){
        String mensaje = "";
        if(nReservas<MAX_RESERVAS){
            reservas[nReservas]=r;
            nReservas++;
            mensaje = "Reserva agregada correctamente";
        }else {
            mensaje = "No se pueden agregar mas reservas";
        }
        return mensaje;
    }
}
