public class AtaqueMagico extends Ataque {
    private int danioMagico;

    public AtaqueMagico(String nombre, int costoMana, int danioMagico, Estado estadoEfecto) {
        super(nombre, costoMana, estadoEfecto);
        this.danioMagico = danioMagico;
    }

    public AtaqueMagico(String nombre, int costoMana, int danioMagico) {
        this(nombre, costoMana, danioMagico, null);
    }

    @Override
    public void ejecutar(Entidad atacante, Entidad objetivo) {
        if (atacante.getManaActual() < this.costoMana) {
            System.out.println("¡No hay suficiente maná para lanzar " + nombre + "!");
            return;
        }

        // Descuenta maná y aplica daño
        atacante.descontarMana(this.costoMana);
        System.out.println(atacante.getClass().getSimpleName() + " lanza " + nombre + " haciendo " + danioMagico + " de daño mágico.");
        objetivo.recibirDano(danioMagico);

        // Aplica el estado si el ataque lo tiene
        if (estadoEfecto != null) {
            objetivo.aplicarEstado(estadoEfecto);
            System.out.println("¡" + objetivo.getClass().getSimpleName() + " ahora tiene el estado " + estadoEfecto.getNombre() + "!");
        }
    }
}