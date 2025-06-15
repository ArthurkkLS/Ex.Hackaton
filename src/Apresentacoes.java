import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> lista;

    private Apresentacoes(){
        lista = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public void adicionar(Apresentacao a) {
        lista.add(a);
    }

    public List<Apresentacao> getApresentacoes() {
        return lista;
    }
}
