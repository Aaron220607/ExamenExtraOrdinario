import java.util.*;
public class main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Club club = new Club("Club Nautico LA MARINA");
        boolean cvValido = true;
        int cvCorrecto = 0;
        do{
        try{
        Motos moto1 = new Motos(1, "Yamaha", 50, 10);
        moto1.setCv(cvCorrecto);
        cvValido = true;
        club.addEmbarcacion(moto1);
        System.out.println("Embarcaciones en el club: " + club.getNEmbarcaciones());
        System.out.println(club.mostrarInformacion());
        Socio socio1 = new Socio(123);
        Reserva reserva1 = new Reserva(1,moto1);
        socio1.addReserva(reserva1);
        System.out.println("Reserva realizada: " + reserva1.toString());
        } catch (CaballosException e){
            System.out.println(e.getMessage());
            System.out.println("Ingrese un valor valido para los caballos:");
            cvCorrecto = sc.nextInt();
            cvValido = false;
        }
    } while (!cvValido);
    }
}
