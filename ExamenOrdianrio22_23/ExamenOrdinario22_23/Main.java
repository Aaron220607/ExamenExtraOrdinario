public class Main {
    public static void main(String[] args) {
        Maletin maletin = new Maletin();
        Mantenimiento mantenimiento = new Mantenimiento("Juan");
        Reparador reparacion = new Reparador("Pedro");
        Trabajador[] trabajadores = {mantenimiento, reparacion};
        try{
            System.out.println(reparacion.repararPuerta(maletin));
            System.out.println(reparacion.repararVentana(maletin));
            System.out.println(mantenimiento.reponerMaletin(maletin));
        } catch(TallerException e){
            System.out.println(e.getMessage());
            System.out.println(mantenimiento.reponerMaletin(maletin));
        }
        mostrarInformacion(trabajadores);
    }
    public static void mostrarInformacion(Trabajador[] trabajadores){
        for(int i=0;i<trabajadores.length;i++){
            System.out.println(trabajadores[i].toString() + "Salario: " + trabajadores[i].calcularSalario());
        }
    }
}
