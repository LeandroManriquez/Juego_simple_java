public abstract class Entidad {
    protected int vidaActual;
    protected int vidaMaxima;
    protected int manaActual;
    protected int manaMaximo;
    protected Estado estadoActual;
    protected Equipamiento equipamiento;

    public Entidad(int vidaMaxima, int manaMaximo) {
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.manaMaximo = manaMaximo;
        this.manaActual = manaMaximo;
        this.estadoActual = new EstadoNormal();
        this.equipamiento = null; // Empieza sin equipo
    }

    // Getters y Setters
    public int getVidaActual() { return vidaActual; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getManaActual() { return manaActual; }
    public int getManaMaximo() { return manaMaximo; }
    public Estado getEstadoActual() { return estadoActual; }
    public Equipamiento getEquipamiento() { return equipamiento; }

    public void aplicarEstado(Estado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void equipar(Equipamiento nuevoEquipo) {
        this.equipamiento = nuevoEquipo;
    }

    public void procesarEstado() {
        estadoActual.alIniciarTurno(this);
    }

    public void recibirDano(int cantidad) {
        int reduccion = (equipamiento != null) ? equipamiento.getBonusDefensa() : 0;
        int danoFinal = Math.max(1, cantidad - reduccion); 
        this.vidaActual = Math.max(0, this.vidaActual - danoFinal);
    }

    public void descontarMana(int cantidad) {
        this.manaActual = Math.max(0, this.manaActual - cantidad);
    }
}