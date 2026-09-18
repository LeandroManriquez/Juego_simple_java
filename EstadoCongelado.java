public class EstadoCongelado implements Estado {
    private int turnosRestantes;

    public EstadoCongelado(int duracion) {
        this.turnosRestantes = duracion;
    }

    // Constructor por defecto (1 turno congelado)
    public EstadoCongelado() {
        this(1);
    }

    @Override
    public String getNombre() {
        return "Congelado";
    }

    @Override
    public void alIniciarTurno(Entidad entidad) {
        if (turnosRestantes > 0) {
            System.out.println("¡" + entidad.getClass().getSimpleName() + " está congelado y no puede moverse este turno!");
            turnosRestantes--;
        } else {
            System.out.println("El hielo se rompe. " + entidad.getClass().getSimpleName() + " se ha descongelado.");
            entidad.aplicarEstado(new EstadoNormal());
        }
    }
}