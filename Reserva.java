public class Reserva implements IDatos {
private int reservas;
Embarcacion[] embarcaciones;
public Reserva() {
    this.reservas = 0;
    this.embarcaciones = new Embarcacion[IDatos.MAX_RESERVAS];
}

public String toString() {
    return "Reserva [reservas=" + reservas + "]";
}
}
