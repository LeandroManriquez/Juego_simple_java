public class EstadoEnvenenado implements Estado {

    @Override
    public String getNombre() {
        return "ENVENENADO";
    }

    @Override
    public void alIniciarTurno(Jugador jugador) { 
        System.out.println("¡El veneno te hace efecto!");
        jugador.recibirDano(5); 
    }
}