import java.util.*;

public class main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Club club = new Club("Club Nautico La Marina");

        // --- Añadir piragua (no lanza excepcion) ---
        Piraguas piragua1 = new Piraguas(2, "Kayak", 3);
        club.addEmbarcacion(piragua1);

        // --- Añadir moto con validacion de cv ---
        boolean cvValido = false;
        int cvCorrecto = 50; // valor inicial valido para empezar
        do {
            try {
                Motos moto1 = new Motos(1, "Yamaha", cvCorrecto, 10);
                cvValido = true;
                club.addEmbarcacion(moto1);

                // Mostrar informacion de todas las embarcaciones
                System.out.println("Embarcaciones en el club: " + club.getNEmbarcaciones());
                System.out.println(club.mostrarInformacion());

                // Mostrar precio de alquiler de cada embarcacion
                System.out.println("Precio alquiler piragua: " + piragua1.alquiler());
                System.out.println("Precio alquiler moto: " + moto1.alquiler());

                // Crear socio, hacer reserva y mostrar total
                Socio socio1 = new Socio(123);
                Reserva reserva1 = new Reserva(1, moto1);
                socio1.addReserva(reserva1);
                System.out.println("Reserva realizada: " + reserva1.toString());
                System.out.println("Total a pagar por el socio: " + socio1.calcularTotal());

            } catch (CaballosException e) {
                System.out.println(e.getMessage());
                System.out.println("Ingrese un valor valido para los caballos (entre 50 y 350):");
                cvCorrecto = sc.nextInt();
            }
        } while (!cvValido);
    }
}