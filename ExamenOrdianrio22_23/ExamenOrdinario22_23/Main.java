public class Main {
    public static void main(String[] args) {
        Maletin maletin = new Maletin();
        Mantenimiento mantenimiento = new Mantenimiento("Juan");
        Reparador reparacion = new Reparador("Pedro");
        
        // Referencia polimórfica obligatoria
        Trabajador[] trabajadores = {mantenimiento, reparacion};

        try {
            // Pedro realiza las dos reparaciones usando el mismo maletín
            System.out.println(reparacion.repararVentana(maletin));
            System.out.println(reparacion.repararPuerta(maletin));
            
            // NOTA: El enunciado dice que "cuando un reparador devuelve el maletín", 
            // mantenimiento lo repone. Esto simula el fin de la jornada.
            System.out.println("\n--- Pedro devuelve el maletín al taller ---");
            System.out.println(mantenimiento.reponerMaletin(maletin));
            
        } catch (TallerException e) {
            // Reposición de emergencia en caso de quedarse sin piezas
            System.out.println("Excepción capturada: " + e.getMessage());
            System.out.println(mantenimiento.reponerMaletin(maletin));
        }

        System.out.println("\n--- ESTADO FINAL DEL MALETÍN ---");
        System.out.println(maletin.toString());

        System.out.println("\n--- SALARIOS CALCULADOS POLIMÓRFICAMENTE ---");
        mostrarInformacion(trabajadores);
    }

    public static void mostrarInformacion(Trabajador[] trabajadores) {
        for (int i = 0; i < trabajadores.length; i++) {
            // El polimorfismo se encarga de llamar al método correcto de cada rol
            System.out.println(trabajadores[i].toString() + " | Salario: " + trabajadores[i].calcularSalario() + "€");
        }
    }
}