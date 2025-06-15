import java.util.HashMap;
import java.util.Map;

public class Banca implements IAvaliavel{
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados = new HashMap<>();

    //construtor
    public Banca(Projeto projeto, Map<Jurado, Integer> jurados){
        this.projetoAvaliado = projeto;
        this.jurados = jurados;
    }

    public void adicionarNota(Jurado jurado, int nota){
        jurados.put(jurado, nota);
    } 

    @Override
    public void calcularNotaFinal(){
        if(jurados.isEmpty()){
            System.out.println("Sem notas cadastradas");
            return;
        }

        int soma = 0;
        for (Integer nota : jurados.values()){
            soma += nota;
        }
        int media = soma / jurados.size();

        projetoAvaliado.setNotaFinal(media);
    }

    //GETTERS
    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }
}
