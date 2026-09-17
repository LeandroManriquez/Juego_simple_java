public class Enemigo extends Entidad {

    public Enemigo(int vidaMaxima, int manaMaximo) {
        super(vidaMaxima, manaMaximo);
        
        equipar(Equipamiento.obtenerAleatorio());
    }
}