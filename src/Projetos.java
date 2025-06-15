import java.util.ArrayList;
import java.util.List;

public class Projetos {
    private static Projetos instance;
    private List<Projeto> lista;

    private Projetos(){
        lista = new ArrayList<>();
    }

    public static Projetos getInstance(){
        if(instance == null){
            instance = new Projetos();
        }
        return instance;
    }

    public void adicionar(Projeto p){
        lista.add(p);
    }

    public List<Projeto> getProjetos() {
        return lista;
    }
}
