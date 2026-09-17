import java.util.Random;

public class Equipamiento {
    private String nombre;
    private int bonusAtaque;
    private int bonusDefensa;

   //base datos
    private static final Equipamiento[] CATALOGO = {
        new Equipamiento("Espada de Madera", 5, 0),
        new Equipamiento("Escudo de Cuero", 0, 3),
        new Equipamiento("Hacha Oxidada", 8, 1),
        new Equipamiento("Daga Ligera", 4, 2)
    };

    
    public Equipamiento(String nombre, int bonusAtaque, int bonusDefensa) {
        this.nombre = nombre;
        this.bonusAtaque = bonusAtaque;
        this.bonusDefensa = bonusDefensa;
    }

   
    public static Equipamiento obtenerAleatorio() {
        Random rand = new Random();
        return CATALOGO[rand.nextInt(CATALOGO.length)];
    }

    public static Equipamiento[] getCatalogoCompleto() {
        return CATALOGO;
    }

    
    public String getNombre() { return nombre; }
    public int getBonusAtaque() { return bonusAtaque; }
    public int getBonusDefensa() { return bonusDefensa; }
}