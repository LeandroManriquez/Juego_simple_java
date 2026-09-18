import java.util.ArrayList;
import java.util.List;

public class CatalogoAtaques {

    
    private static final List<Ataque> ATAQUES_FISICOS = new ArrayList<>();
    private static final List<Ataque> ATAQUES_MAGICOS = new ArrayList<>();

    static {
//ATAQUES FISICOS
        ATAQUES_FISICOS.add(new AtaqueFisico("Corte Simple", 12));
        ATAQUES_FISICOS.add(new AtaqueFisico("Corte Doble", 20));
        ATAQUES_FISICOS.add(new AtaqueFisico("Desgarrar", 15, new EstadoSangrado()));

//ATAQUES MAGICOS

        ATAQUES_MAGICOS.add(new AtaqueMagico("Bola de Fuego", 8, 25));
        ATAQUES_MAGICOS.add(new AtaqueMagico("Rayo Gelido", 12, 35, new EstadoCongelado()));
    }

    public static List<Ataque> getAtaquesFisicos() {
        return ATAQUES_FISICOS;
    }

    public static List<Ataque> getAtaquesMagicos() {
        return ATAQUES_MAGICOS;
    }
}