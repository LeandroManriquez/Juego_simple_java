public class AtaqueFisico extends Ataque {
    private int danioBase;

    // Constructor completo (con Estado)
    public AtaqueFisico(String nombre, int danioBase, Estado estadoEfecto) {
        super(nombre, 0, estadoEfecto);
        this.danioBase = danioBase;
    }

    // Sobrecarga de constructor para ataques sin estado
    public AtaqueFisico(String nombre, int danioBase) {
        this(nombre, danioBase, null);
    }

    @Override
    public void ejecutar(Entidad atacante, Entidad objetivo) {
        int bonusArma = (atacante.getEquipamiento() != null) ? atacante.getEquipamiento().getBonusAtaque() : 0;
        int danioTotal = danioBase + bonusArma;

        System.out.println(atacante.getClass().getSimpleName() + " ejecuta " + nombre + " infligiendo " + danioTotal + " de daño físico.");
        objetivo.recibirDano(danioTotal);

        // Si el ataque incluye un efecto de estado, se lo aplicamos a la entidad objetivo
        if (estadoEfecto != null) {
            objetivo.aplicarEstado(estadoEfecto);
            System.out.println("¡" + objetivo.getClass().getSimpleName() + " ahora tiene el estado " + estadoEfecto.getNombre() + "!");
        }
    }
}