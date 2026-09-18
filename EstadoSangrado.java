public class EstadoSangrado implements Estado {
    private int turnosRestantes;
    private int danoPorTurno;

    public EstadoSangrado(int duracion, int danoPorTurno) {
        this.turnosRestantes = duracion;
        this.danoPorTurno = danoPorTurno;
    }

    // Constructor por defecto (3 turnos, 5 de daño)
    public EstadoSangrado() {
        this(3, 5);
    }

    @Override
    public String getNombre() {
        return "Sangrado";
    }

    @Override
    public void alIniciarTurno(Entidad entidad) {
        if (turnosRestantes > 0) {
            System.out.println("¡" + entidad.getClass().getSimpleName() + " sufre " + danoPorTurno + " de daño por sangrado!");
            entidad.recibirDano(danoPorTurno);
            turnosRestantes--;
        } else {
            System.out.println("El efecto de sangrado ha terminado.");
            entidad.aplicarEstado(new EstadoNormal()); // Vuelve al estado base
        }
    }
}