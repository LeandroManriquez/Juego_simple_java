public abstract class Ataque {
    protected String nombre;
    protected int costoMana;
    protected Estado estadoEfecto;

   
    public Ataque(String nombre, int costoMana, Estado estadoEfecto) {
        this.nombre = nombre;
        this.costoMana = costoMana;
        this.estadoEfecto = estadoEfecto;
    }


    public Ataque(String nombre, int costoMana) {
        this(nombre, costoMana, null);
    }

    public String getNombre() { return nombre; }
    public int getCostoMana() { return costoMana; }
    public Estado getEstadoEfecto() { return estadoEfecto; }

    public abstract void ejecutar(Entidad atacante, Entidad objetivo);
}