public class InterfazConsola {

    public void mostrarPantalla(Jugador jugador, Enemigo enemigo) {
        System.out.println("\n================ COMBATE ================");
        
        // --- ENEMIGO ---
        System.out.println("ENEMIGO: ");
        System.out.println("VIDA:   " + enemigo.getVidaActual() + "/" + enemigo.getVidaMaxima());
        if (enemigo.getEquipamiento() != null) {
            System.out.println("EQUIPO: " + enemigo.getEquipamiento().getNombre());
        }
        System.out.println("-----------------------------------------");

        // --- JUGADOR ---
        System.out.println("JUGADOR:");
        System.out.println("ESTADO: " + jugador.getEstadoActual().getNombre());
        System.out.println("VIDA:   " + jugador.getVidaActual() + "/" + jugador.getVidaMaxima());
        System.out.println("MANA:   " + jugador.getManaActual() + "/" + jugador.getManaMaximo());
        if (jugador.getEquipamiento() != null) {
            System.out.println("EQUIPO: " + jugador.getEquipamiento().getNombre());
        }

        System.out.println("=========================================");
        System.out.println("1. Atacar  |  2. Magia  |  3. Objeto  |  4. Defender");
        System.out.print("Selecciona una opción: ");
    }
}