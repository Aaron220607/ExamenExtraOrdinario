public class Reserva implements IDatos {
private int reservas;
Embarcacion embarcaciones;
public Reserva(int reservas, Embarcacion embarcacion) {
    this.reservas = reservas;
    this.embarcaciones = embarcacion;
}

public String toString() {
    return "Reserva [reservas=" + reservas + "]" + "Total a pagar: " + embarcaciones.alquiler();
}
}
